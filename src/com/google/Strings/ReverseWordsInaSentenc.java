package com.google.Strings;
import java.util.*;
public class ReverseWordsInaSentenc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]+" ");
		}

	}

}
//hi i am manoj naidu
//naidu manoj am i hi ==>output