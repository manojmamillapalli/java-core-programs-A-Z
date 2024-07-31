package com.google.methods;

public class NoArgsNoReturnType {

	public static void main(String[] args) {
	
          Fact();
	}
	//no arguments and no return type method declaration.
	public static void Fact()
	{
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact);;
	}

}
