package com.google.patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                         
		System.out.println("Enter the row value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			  for(int j=1;j<=n-i+1;j++)
			  {
				  if(i==1|| j==1|| i+j==n+1)
				  {
					  System.out.print("*"+" ");
				  }
				  else
					  System.out.print("  ");
			  }
			  System.out.println();
		}

	}
//	* * * * * 
//	*     * 
//	*   * 
//	* * 
//	* 
}
