package section4;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.TypeDescriptors;

public class SmallToCaps {
	
	public static void main(String[] args)
	{
		Pipeline pipeline=Pipeline.create(); 
		
		PCollection<String> plist=pipeline.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/section4/input/list.csv"));
		
		PCollection<String> output=plist.apply(MapElements.into(TypeDescriptors.strings()).via((String obj) -> obj.toUpperCase()));
	
		output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/section4/output/results.csv").withNumShards(1).withSuffix(".csv"));
		 
		pipeline.run();
	}
}
