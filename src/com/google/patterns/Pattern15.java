package com.google.patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			  for(int j=1;j<=n-i+1;j++)
			  {
				  System.out.print("*"+ " ");
			  }
			  System.out.println();
		}
	}

}
