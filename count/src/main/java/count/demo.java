package count;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.Count;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;


public class demo {
	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create(); 
		
		PCollection<String> list=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/count/input/Distinct.csv"));
		
		PCollection<Long> num=list.apply(Count.globally());
		
		num.apply(ParDo.of(new DoFn<Long, Void>(){
			
			@ProcessElement
			public void processElement(ProcessContext c)
			{
				System.out.println(c.element()); 
			}
			
		}));
		
		p.run(); 
	}
	
}
