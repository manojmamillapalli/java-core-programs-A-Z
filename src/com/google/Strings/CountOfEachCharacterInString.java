package com.google.Strings;
import java.util.*;
public class CountOfEachCharacterInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		NewString(s);
	}
	public static void NewString(String s) {
	   
	    while(s.length()>0)
	    {
	    char c = s.charAt(0);
	    String s1 = s.replace(c+"", "");
	    int count = s.length() - s1.length();
	    System.out.println(c + "=" + count);
	    s=s1;
	    }
	}

}
