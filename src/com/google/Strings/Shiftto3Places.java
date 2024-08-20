package com.google.Strings;

import java.util.Arrays;

public class Shiftto3Places {

	public static void main(String[] args) {
		String str="savy";
		String result="";
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]-97>22)
			{
				result=result+(char)(c[i]-26+3);
			}
			else
			
			  result=result+(char)(c[i]+3);
		}
		System.out.println(result);
		

	}

}
