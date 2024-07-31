package com.google.oops;

public class Calltothis {
	Calltothis()
	{   this(1,2);
		System.out.println("Default constructor ");
	}
	Calltothis(int a, int b)
	{   this(1,2,3);
		System.out.println("2 arguments constructor ");
	}
	Calltothis(int a, int b, int c)
	{
		System.out.println("three constructor ");
	}
	public static void main(String[] args)
	{
		Calltothis a=new Calltothis();
	}
}
