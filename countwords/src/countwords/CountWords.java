package countwords;

import java.util.Arrays;

public class CountWords {
	
	public static void main(String[] args) {
		
		String name = "My name is Sai Natha Reddy Nooli"; 
		
		boolean isWord = false;
		
		char[] characters = name.toCharArray();
		
		int length = name.length(); 
		
		for(int i =0; i<length; i++)
		{
			if(Character.isLetter(characters[i]) && i != length)
			{
				isWord = true;
			}
		}
		
	}

}
