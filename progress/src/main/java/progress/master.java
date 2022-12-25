package progress;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO; 
import org.apache.beam.sdk.values.PCollection; 

public class master {
	
	public static void main(String[] args)
	{
		Pipeline pipeline=Pipeline.create(); 
		
		PCollection<String> output=pipeline.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/progress/input/vendor.csv"));
		
		output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/progress/output/results.csv"));
		
		pipeline.run(); 
	}

}
