package com.google.iterations;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to find fibonacci series:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			int c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
