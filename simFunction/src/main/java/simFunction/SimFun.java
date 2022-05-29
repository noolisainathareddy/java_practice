package simFunction;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.PCollection; 
import org.apache.beam.sdk.transforms.SimpleFunction; 

class Users extends SimpleFunction<String, String>
{
	public String apply(String input)
	{
	
		String arr[] = input.split(",");
		
		String name = arr[0];
		String age = arr[1];
		String place = arr[2];
		String sex = arr[3]; 
		
		String output = "";
		if(sex.equals("1"))
		{
			output= name + "," + age + "," + place + "," + "M"; 
		}
		else if(sex.equals("2"))
		{
			output= name + "," + age + "," + place + "," + "F";
		}
		else
		{
			output=input; 
		}
		
		return output; 
	}

}
public class SimFun {
	
	public static void main(String[] args)
	{
		 Pipeline pipeline=Pipeline.create();
		 
		 PCollection<String> plist=pipeline.apply(TextIO.read().from("/Users/sainooli/git_loacl_repo/simFunction/input/details.csv"));
		 
		 PCollection<String> output=plist.apply(MapElements.via(new Users()));
		 
		 output.apply(TextIO.write().to("/Users/sainooli/git_loacl_repo/simFunction/output/res.csv").withNumShards(1).withSuffix(".csv"));
		 
		 
		 pipeline.run();
		 
	}

}
