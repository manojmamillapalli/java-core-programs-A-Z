package com.google.Strings;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		String s="maaam";
		char[] c=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j)
		{
			if(c[i]==c[j])
			{
				i++;
				j--;
				if(i>=j)
				{
					System.out.println("string is palindrome");
					break;
				}
			}
			else
			{
			System.out.println("string not a palindrome");
			break;
			}
		}

	}

}
