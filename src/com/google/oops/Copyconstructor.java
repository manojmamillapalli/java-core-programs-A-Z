package com.google.oops;
import java.util.*;
public class Copyconstructor {
	int i;
	Copyconstructor(Copyconstructor c)
	{
		i=c.i;
		System.out.println("Original constructor1:");
		//System.out.println(i);
	}
	Copyconstructor(int i)
	{   
		this.i=i;
		System.out.println("NEwly created consructor:");
	}
	
	public static void main(String[] args)
	{
		Copyconstructor a=new Copyconstructor(2);
		System.out.println(a.i);
		Copyconstructor a1=new Copyconstructor(a);
		System.out.println(a1.i);
		
	}
}
