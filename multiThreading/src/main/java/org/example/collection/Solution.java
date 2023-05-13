package org.example.collection;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        System.out.println(a.toLowerCase());

        b.toLowerCase();
        StringBuilder c = new StringBuilder(b);

        if(a.length() == c.length()){
            for(int i=0;i<a.length();i++){
                for(int j=0;j<c.length(); j++){
                    if(a.charAt(i) == c.charAt(j)){
                        c.deleteCharAt(j);
                        if(c.length() == 0){
                            return true;

                        }
                        break;
                    }
                }
            }
        }
        System.out.println(c);
        return false;
    }

    public static void main(String[] args) {
        String a = "HELLO";
        String b = "Hello";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
