package com.google.Strings;
import java.util.*;
public class ReverseEachWordANDInverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=Reversed(str);
		String[] str2=str1.split(" ");
		for(int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]+" ");
		}
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
	public static String Reversed(String str)
	{
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
		
		 return new String(c);
	}
}
