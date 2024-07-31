package com.google.methods;

public class WithArgsNoReturnType {

	public static void main(String[] args) {
		//with argumrnts no return type
Fact(5);//we need to pass an value while calling an method.
	}
	public static void Fact(int n)
	{
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact);;
	}

}
