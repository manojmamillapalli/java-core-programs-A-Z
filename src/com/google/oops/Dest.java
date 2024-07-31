package com.google.oops;
import java.util.*;
public class Dest extends Thread {
	
	Dest()
	{
		System.out.println("Object is created:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 Dest a;
 for(int i=0;i<100000;i++)
 {
	 a=new Dest();
	 
 }
 
	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("object is destroyed:");
	}

}
