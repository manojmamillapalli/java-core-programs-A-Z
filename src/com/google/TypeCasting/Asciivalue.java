package com.google.TypeCasting;

public class Asciivalue {
public static void main(String[] args)
{   String str="Codegnan";
	int n=str.length();
	int[] arr=new int[n];
	for(int i=0;i<str.length();i++)
	{
		arr[i]=(int)str.charAt(i);
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
