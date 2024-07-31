package com.google.patterns;
import java.util.*;
public class Patter3nReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number of rows need to print");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
        	 for(int j=n;j>=i;j--)
        	 {
        		 System.out.print("*"+ " ");
        	 }
        	 System.out.println();
         }
	}

}
