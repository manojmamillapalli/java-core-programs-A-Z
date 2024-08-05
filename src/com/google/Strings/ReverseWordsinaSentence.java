package com.google.Strings;

public class ReverseWordsinaSentence {

	public static void main(String[] args) {
		String str="Hello man i am manoj";
		char[] c=str.toCharArray();
		int i=0;
		
		
        
		 while (i < c.length) {
	            int j = i;
	            
	            
	            while (j < c.length && c[j] != ' ') {
	                j++;
	            }
	            
	            
	            swap(c, i, j - 1);
	            
	            
	            i = j + 1;
	        }
		
		 System.out.println(new String(c));
	}
	public static void swap(char[] c, int start, int end)
	{
		while(start<end)
		{
		char temp=c[end];
		c[end]=c[start];
		c[start]=temp;
		start++;
		end--;
		}
	}

}
