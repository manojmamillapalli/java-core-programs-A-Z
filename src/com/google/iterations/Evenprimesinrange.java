package com.google.iterations;
import java.util.*;
public class Evenprimesinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting point to find the prime numbers: ");
		int start=sc.nextInt();
		System.out.println("Enter the end point to find the prime numbers: ");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(Primenum(i))
			{
				if(i%2!=0)
				{
					System.out.print(i+ " ");
				}
			}
				
			
			
		}

	}
	static boolean Primenum (int n)
	{
//		if(n==2)
//			return true;
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
//			break;
		}
		return true;
	}

}
