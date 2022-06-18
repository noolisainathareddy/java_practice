package partition;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.Partition;
import org.apache.beam.sdk.transforms.Partition.PartitionFn; 
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionList; 





class MyCityPartition implements PartitionFn<String>
{
	public int partitionFor(String elem, int numPartition)
	{
		String arr[] = elem.split(",");
		
		if(arr[3].equals("Los Angeles"))
		{
			return 0; 
		}
		else if(arr[3].equals("Phoenix"))
		{
			return 1;
		}
		
		else
		{
			return 2; 
		}
	}
}
public class parti {

	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create(); 
		
		PCollection<String> pCustlister=p.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/partition/input/Partition.csv")); 
		
		PCollectionList<String> part = pCustlister.apply(Partition.of(3,(new MyCityPartition())));
		
		PCollection<String> p0=part.get(0);
		PCollection<String> p1=part.get(1);
		PCollection<String> p2=part.get(2);
		
		p0.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/partition/output/Part1.csv").withNumShards(1).withSuffix(".csv"));
		p1.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/partition/output/Part2.csv").withNumShards(1).withSuffix(".csv"));
		p2.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/partition/output/Part3.csv").withNumShards(1).withSuffix(".csv"));
		
		p.run();
	}
}
