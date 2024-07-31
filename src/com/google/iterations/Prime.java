package com.google.iterations;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find weathet it is prime or not: ");
		int n=sc.nextInt();
       System.out.println( Primenum(n));
	}
	static boolean Primenum (int n)
	{
//		if(n==2)
//			return true;
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			break;
		}
		return true;
	}

}
