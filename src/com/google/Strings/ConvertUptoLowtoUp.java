package com.google.Strings;

public class ConvertUptoLowtoUp {

	public static void main(String[] args) {
		String  str="HeLLo wORLD";
		String result="";
		for(int i=0;i<str.length();i++)// ascii value of A=65, a=97
		{
			Character c=str.charAt(i);
			if(c.isLowerCase(c))
			{
				c=(c.toUpperCase(c));
			}
			else
			{
				c=(c.toLowerCase(c));
			}
			result=result+c;
		}
		System.out.println(result);
		
	}

}
