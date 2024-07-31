package com.google.patterns;
import java.util.*;
import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);                         
		System.out.println("Enter the row value:");
		int n=sc.nextInt();



		for(int i=1;i<=n;i++)
		{
			  for(int j=1;j<=n;j++)
			  {
				  if(i==1|| j==n/2|| i==n)
				  {
					  System.out.print("*"+" ");
				  }
				  else
					  System.out.print("  ");
			  }
			  System.out.println();
		}
	}

}
