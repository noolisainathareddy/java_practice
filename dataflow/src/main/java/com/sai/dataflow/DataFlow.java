package com.sai.dataflow;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection;

public class DataFlow {
	
	public static void main(String[] args)
	{
		Pipeline p=Pipeline.create();
		
		PCollection<String> outCollection=p.apply(TextIO.read().from("/Users/sainooli/eclipse-workspace/dataflow/input/input1.csv"));
		
		outCollection.apply(TextIO.write().to("/Users/sainooli/eclipse-workspace/dataflow/output/output1"));
		
		System.out.println("sai");
		
		p.run(); 
	}

}