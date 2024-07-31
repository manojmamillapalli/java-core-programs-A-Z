package com.google.iterations;
import java.util.*;
public class Factors {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value for the factorials");
				int n=sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				
			}
			
		}
		System.out.println(n);
	}

}
