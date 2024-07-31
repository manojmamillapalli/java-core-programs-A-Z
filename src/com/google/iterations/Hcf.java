package com.google.iterations;
import java.util.*;
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1 to find the HCF:");
		int a=sc.nextInt();
		System.out.println("Enter the number2 to find the HCF:");
		int b=sc.nextInt();
		int result=GCD(a,b);
		System.out.println(result);
	}
	static int GCD(int a, int b)
	{
		int gcd=1;
		int c=(a<b)?a:b;
		int i=c;
		while(i<=c)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
				break;
			}
			i-=1;
		}
		return gcd;
	}
	

}
