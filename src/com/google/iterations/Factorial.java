package com.google.iterations;
import java.util.*;
public class Factorial {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int start=sc.nextInt();
		int n=sc.nextInt();
//		for(int i=start;i<=n;i++)
//		{
//			int fact=1;
//			for(int j=1;j<=i;j++)
//			{
//				fact=fact*j;
//			}
//			System.out.println(fact);
//		}
		for(int i=start;i<=n;i++)
		{
			System.out.println(fact(i));
			
		}
		
	}
	static double fact(int n)
	{
		
		if(n==0)
			return 1;
		else 
		return n*fact(n-1);
	}

}
