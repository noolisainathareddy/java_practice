package pardo;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.DoFn.ProcessContext;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection; 


class CustFilters extends DoFn<String, String>
{
	@ProcessElement
	public void processElement(ProcessContext c)
	{
		String line = c.element(); 
		String arr[] = line.split(",");
		
		if (arr[3].equals("Los Angeles"))
		{
			c.output(line);
		}
 	}
	
}
public class dofunct {
	
	public static void main(String[] args)
	
	{
		Pipeline pipeline = Pipeline.create(); 
		
		PCollection<String> plist=pipeline.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/pardo/input/customer_pardo.csv")); 
		
		PCollection<String> output=plist.apply(ParDo.of(new CustFilters())); 
		
		output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/pardo/output/result.csv").withHeader("id, name, last name, city").withNumShards(1).withSuffix(".csv"));
		
		pipeline.run();
	}

}
