package com.google.Strings;

import java.util.ArrayList;

public class SumOfNumbersinString {

	public static void main(String[] args) {
		String str="abc123def45";
//		char[] c=str.toCharArray();
		ArrayList<Character> list=new ArrayList<>();
		String result="";
		
		for(int i=0;i<str.length();i++)
{
			char c=str.charAt(i);
	if((c>='0'-'0' && c<='9'-'0'))
	{
		list.add(c);
	}
	System.out.print(list);
}
	}

}
