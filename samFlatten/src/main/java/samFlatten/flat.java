package samFlatten;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO; 
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionList; 
import org.apache.beam.sdk.transforms.Flatten;

public class flat {
	
	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create();
		
		PCollection<String> file1=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/samFlatten/input/customer_1.csv"));

		PCollection<String> file2=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/samFlatten/input/customer_2.csv"));
		
		PCollection<String> file3=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/samFlatten/input/customer_3.csv"));
		
		PCollectionList<String> list=PCollectionList.of(file1).and(file2).and(file3); 
		
		PCollection<String> merge=list.apply(Flatten.<String>pCollections()); 
		
		merge.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/samFlatten/output/results.csv").withNumShards(1).withSuffix(".csv"));
		
		p.run();
		
	}

}
