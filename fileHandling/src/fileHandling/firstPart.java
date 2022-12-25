package fileHandling;
import java.io.*;

public class firstPart {
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("test.txt");
		DataOutputStream dos=new DataOutputStream((fos)); 
		
		dos.writeUTF("this is new test file"); 
		
		
		FileInputStream fis=new FileInputStream("test.txt");
		DataInputStream dis=new DataInputStream((fis)); 
		
		String content = dis.readUTF(); 
		System.out.println("completed successfully : " + content); 
		
	}
}
