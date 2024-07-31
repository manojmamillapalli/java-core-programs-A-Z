package com.google.oops;
import java.util.*;
public class Objectexperiment {
	Objectexperiment()
	{
		System.out.println("constructor of the main class:");
	}
	 static void m1()
	{
		System.out.println("object inside the method");
		Objectexperiment a=new Objectexperiment();
		a.m2();
		a.main();
		
	}
	static void m2()
	{   
		
		System.out.println("Can object inside one ststic access another static method:");
	}
	
	static void main()
	{
		System.out.println("Creating another main method:");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objectexperiment b=new Objectexperiment();
		Objectexperiment.m1();
	}

}
