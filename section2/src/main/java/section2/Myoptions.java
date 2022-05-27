package section2;

import org.apache.beam.sdk.options.PipelineOptions; 

public interface Myoptions extends PipelineOptions{
	
	void setInputFile(String file);
	String getInputFile(); 
	
	void getOutputFile(String file);
	String getOutputFile();
	
	void setExtn(String extn);
	String getExtn(); 
}
