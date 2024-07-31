package com.google.patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row value:");
        int n=sc.nextInt();
		for(int i=1;i<=n;i++)
        {
       	 for(int j=1;j<=n;j++)
       	 {
       		 if(i+j==n+1)//(J==N-I+1)
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

//1 2 3 4 5
//2 3 4 5 
//3 4 5
//4 5
//5


//5 4 3 2 1 
//5 4 3 2 
//5 4 3
//5 4 
//5


//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1


//*****
//*  *
//* *
//*


//11 12 13 14 15
//21 22 23 24 25 
//31 32 33 34 35
//41 42 43 44 45
//51 52 53 54 55
