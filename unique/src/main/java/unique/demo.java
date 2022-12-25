package unique;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.Distinct;
import org.apache.beam.sdk.values.PCollection; 


public class demo {
	
	public static void main(String args)
	{
		Pipeline p=Pipeline.create(); 
		
		PCollection<String> list=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/unique/input/details.csv"));
		
		PCollection<String> unique=list.apply(Distinct.<String>create());
		
		unique.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/unique/output/results.csv"));
		
		p.run(); 
	}

}
