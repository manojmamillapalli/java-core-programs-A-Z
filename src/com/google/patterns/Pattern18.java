package com.google.patterns;
import java.util.*;
import java.util.Scanner;

public class Pattern18 {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);                         
		System.out.println("Enter the row value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			  for(int j=1;j<=n-i;j++)
			  {
				  System.out.print("  ");
			  }
			 for(int k=n;k>=n-i+1;k--)//for(int k=1;k<=i;k++) also work for *
			 {
				 System.out.print(k+" ");
			 }
			 System.out.println();
		}
	}
//    *
//   **
//  ***
// ****
//*****
	//5
//	 5 4 
//	    5 4 3 
//	  5 4 3 2 
//	5 4 3 2 1 


}
