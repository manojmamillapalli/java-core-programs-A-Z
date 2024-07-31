package com.google.methods;

public class WithArguWithReturn {

	public static void main(String[] args) {
		//with return type and with arguments
		System.out.print(Fact(10));// the arguments which we pass while we are calling the methods is known as actual arguments.
	}
	 
	static public final  int  Fact(int n)// the arguments which we pass at the time of method declaration is formal parameters
	{      // the actual and formal arguments can be same or different 
		//today tasks
		//pyramids left and right
		//pattern 2 hallow 
		//passing extra arguments while calling 
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
