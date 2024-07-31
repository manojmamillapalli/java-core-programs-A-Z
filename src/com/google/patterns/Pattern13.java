package com.google.patterns;
import java.util.*;
import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value:");
		int n=sc.nextInt();
		//5 4 3 2 1 
		//4 3 2 1 
		//3 2 1 
		//2 1 
		//1

		for(int i=1;i<=n;i++)
		{
			  for(int j=n-i+1;j>=1;j--)
			  {
				  System.out.print(j+ " ");
			  }
			  System.out.println();
		}

	}

}
