package com.google.patterns;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the row value:");
         int n=sc.nextInt();
         int n1=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
        	 for(int j=1;j<=n1;j++)
        	 {
        		 if(i==1 || i==n || j==1 ||j==n1)
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
