package com.google.methods;

public class WithReturnTypeNoArgu {

	public static void main(String[] args) {
		//with return type no arguments
          System.out.print(Fact());
	}
	public   static int  Fact()
	{
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
	      }
		return fact;
	}
	

}
