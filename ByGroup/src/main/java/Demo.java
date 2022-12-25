import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.DoFn.ProcessContext;
import org.apache.beam.sdk.transforms.GroupByKey;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.vendor.grpc.v1p43p2.io.grpc.Attributes.Key; 


class StringToKV extends DoFn<String, KV<String, Integer>>
{
		@ProcessElement
		public void processElement(ProcessContext c)
		{
			String input=c.element(); 
			String arr[] = input.split(",");
			
			c.output(KV.of(arr[0], Integer.valueOf(arr[3])));
			
		}
	
}

class KVToString extends DoFn<KV<String,Iterable<Integer>>,String>
{
	@ProcessElement
	public void processElement(ProcessContext c)
	{
		String strKey=c.element().getKey(); 
		Iterable<Integer> vals=c.element().getValue(); 
		
		Integer sum=0; 
		for(Integer integer: vals)
		{
			sum=sum+integer; 
		}
		
		c.output(strKey+"," + sum.toString());
	}

}


public class Demo {

	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create();
		
		//step1: 
		PCollection<String> list=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/ByGroup/input/values.csv"));
		
		//step2: CONVER STRING TO KV
		PCollection<KV<String,Integer>> KVorder=list.apply(ParDo.of(new StringToKV())); 
		
		//sTEP 3: aPPLY GROUP BY AND BUILD KV 
		PCollection<KV<String, Iterable<Integer>>> kvorder2= KVorder.apply(GroupByKey.<String, Integer>create());
		
		//STEP4: CONVERT KV TO STRING
		
		PCollection<String> output =kvorder2.apply(ParDo.of(new KVToString()));
		
		//Step:5 write output
		
		output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/ByGroup/output/result.csv").withNumShards(1).withSuffix(".csv"));
		
		p.run();
		
	}
}
