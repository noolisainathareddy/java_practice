package com.example.practice.java8;

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
        Map<Character, Character> map= new HashMap<>();
        map.put('[', ']'); 
        map.put('{', '}'); 
        map.put('(', ')'); 
                String s = "((({{{[]}}})))";
            char[] c = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            
            for(int i=0; i<c.length;i++) {

                if (map.containsKey(c[i])) {
                    stack.add(c[i]);
                }else{
                    if(!stack.isEmpty() && map.get(stack.pop()) == c[i]){
                        continue;
                    }else{
                        System.out.println("False");
                        System.exit(0);
                    }
                }
            }
        System.out.println("True");

	}
}



