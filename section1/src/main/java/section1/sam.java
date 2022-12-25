package section1;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection; 


public class sam {

	public static void main(String[] args)
	{
		Pipeline pipeline=Pipeline.create(); 
		
		PCollection<String> output=pipeline.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/section1/input/vendor.csv"));
		
		output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/section1/output/results.csv").withNumShards(1).withSuffix(".csv"));
		
		pipeline.run(); 
		
	}
}
