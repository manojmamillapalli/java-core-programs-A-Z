package com.google.iterations;
import java.util.*;
public class Forloop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		double mul=1;
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println(Fact(n));
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		
		System.out.println(sum);
		for(int i=1;i<=n;i++)
	{
			mul=mul*i;
		}
		System.out.println(mul);
		
		int sum1=n*(n+1)/2;
		System.out.println(sum1);
		
	}
	
	static double Fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*Fact(n-1);
	}

	

}
