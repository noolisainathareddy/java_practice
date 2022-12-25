import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection; 
import org.apache.beam.sdk.transforms.Filter; 
import org.apache.beam.sdk.transforms.SerializableFunction; 


class MyFilter implements SerializableFunction<String, Boolean>
{
	
	@Override
	public Boolean apply(String input)
	{
		return input.contains("Los Angeles");
	}
}

public class samfilt {
	public static void main(String[] args)
	{
		
		Pipeline p=Pipeline.create();
		
		PCollection<String> plist=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/pardo/input/customer_pardo.csv"));
		
		PCollection<String> output=plist.apply(Filter.by(new MyFilter()));
		
		
		output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/samfilt/output/results.csv").withNumShards(1).withSuffix(".csv"));
		
		p.run();
		
	}
}
