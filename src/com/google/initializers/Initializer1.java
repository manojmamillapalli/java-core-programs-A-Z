package com.google.initializers;

public class Initializer1 {
	static int i;
	static
	{
		i=10;
		i=70;
		System.out.println(i);
	}
	{
		int j=20;
		j=90;
		i=100;
		System.out.println(j);
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		Initializer1 obj=new Initializer1();
	}

}
