package com.google.Strings;

public class LengthWithoutFunctions {
public static void main(String[] args)
{
	String str="Hello World";
	str=str+"\0";
	int i=0;
 char[] s=str.toCharArray();
 int count=0;
 while(true)
 {
	 
	 if(s[i]!='\0')
	 {
		count++; 
	 }
	 else 
		 break;
	 i++;
 }
 System.out.println(count);
}
}
