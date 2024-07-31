package com.google.patterns;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value:");
		int n=sc.nextInt();

		//11 12 13 14 15
		//21 22 23 24 25 
		//31 32 33 34 35
		//41 42 43 44 45
		//51 52 53 54 55

		for(int i=1;i<=n;i++)
		{
			  for(int j=1;j<=n;j++)
			  {
				  System.out.print(i+""+j+ " ");
			  }
			  System.out.println();
		}

	}

}
