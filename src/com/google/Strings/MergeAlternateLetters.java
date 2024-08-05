package com.google.Strings;

public class MergeAlternateLetters {

	public static void main(String[] args) {
		System.out.println(mergeAlternately("pqr", "stuvw"));
	}
	
	    public  static String mergeAlternately(String word1, String word2) {
	        int n1=word1.length();
	        int n2=word2.length();
	        int i=0;
	        int j=0;
	        String result="";
	        while(i<n1&& j<n2)
	        {
	           result=result+word1.charAt(i)+word2.charAt(j);
	           i++;
	           j++;
	        }
	        while(j>=n2 && i<n1)
	        {
	        result=result+word1.charAt(i);
	        i++;
	        }
	        while(i>=n1 && j<n2)
	        {
	        result=result+word2.charAt(j);
	        j++;
	        }
	        return result;
	    
	}

}
