package cogrpby;


import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.transforms.join.CoGbkResult;
import org.apache.beam.sdk.transforms.join.CoGroupByKey;
import org.apache.beam.sdk.transforms.join.KeyedPCollectionTuple;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TupleTag; 


class OrderParsing extends DoFn<String, KV<String, String>>
{
	@ProcessElement
	public void processElement(ProcessContext c)
	{
		String arr[] = c.element().split(",");
		String strKey = arr[0];
		String strVal = arr[1] + "," + arr[2]+ "," + arr[3];
		c.output(KV.of(strKey, strVal));
	}
}

class UserParsing extends DoFn<String, KV<String, String>>
{
	@ProcessElement
	public void processElement(ProcessContext c)
	{
		String arr[] = c.element().split(","); 
		String strKey = arr[0];
		String strVal = arr[1]; 
		c.output(KV.of(strKey, strVal));
 	}
}
public class Demo {
	
	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create(); 
		
		//step1: read input file and conver string to kv
		PCollection<KV<String, String>> porder=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/cogrpby/input/user_order.csv"))
												.apply(ParDo.of(new OrderParsing()));
		
		PCollection<KV<String, String>> puser=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/cogrpby/input/p_user.csv"))
												.apply(ParDo.of(new UserParsing()));
		
		
		//step2 create a tuple tag object
		
		final TupleTag<String> orderTuple=new TupleTag<String>(); 
		final TupleTag<String> userTuple=new TupleTag<String>(); 
		
		
		//step3: combine datasets using co group by key
		
		PCollection<KV<String, CoGbkResult>>  result =KeyedPCollectionTuple.of(orderTuple, porder).and(userTuple, puser).apply(CoGroupByKey.<String>create()); 
		
		//step4: apply cogroup by key and combine result
		PCollection<String>  finalresult=result.apply(ParDo.of(new DoFn<KV<String, CoGbkResult>, String>(){
	
			
			@ProcessElement
			
			public void processElement(ProcessContext c)
			{
				String strKey=c.element().getKey();
				 CoGbkResult valObject=c.element().getValue();
				 
				 Iterable<String> orderTable = valObject.getAll(orderTuple); 
				 Iterable<String> userTable = valObject.getAll(userTuple);
				 
				 for(String order:orderTable) {
					 for(String user: userTable)
						 {
								 c.output(strKey + "," + order + "," + user); 
								 
						 }
				 }
				
			}
			 
			
		}));
		
		finalresult.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/cogrpby/output/result.csv").withNumShards(1).withSuffix(".csv"));
		p.run()
;	}
	

}
