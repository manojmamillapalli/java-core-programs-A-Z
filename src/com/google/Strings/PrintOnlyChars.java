package com.google.Strings;

public class PrintOnlyChars {
public static void main(String[] args)
{
	String s="abcdf45678y";
	for(int i=0;i<s.length();i++) {// prints only characters
		if((s.charAt(i)>='a' && s.charAt(i)<='z'))
		{
			System.out.println(s.charAt(i));
		}
	}
	int sum=0;
	for(int i=0;i<s.length();i++) {// sums the all digits present in the string
		// we need to subctract all the number characters in order to obtain their original values 
		
		if((s.charAt(i)>='0' && s.charAt(i)<='9'))
		{
			sum+=s.charAt(i)-'0';
			
			
		}
	}
	System.out.println(sum);
}
}
