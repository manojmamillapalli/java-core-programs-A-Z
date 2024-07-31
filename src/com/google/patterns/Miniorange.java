package com.google.patterns;
import java.util.*;
public class Miniorange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of rows and columns");
        int n=sc.nextInt();
        if(n>=2)
        {
         for(int i=1;i<=n;i++)
         {
        	 for(int j=1;j<=n;j++)
        	 {
        		 if(i==1||i==j ||j==1|| j==n|| i+j==n+1 ||i==n)
        		 {
        			 System.out.print("*"+" ");
        			 
        		 }
        		 else
        			
        		 System.out.print(" "+ " ");
        		 
        	 }
        	 System.out.println();
         }
        }
	}

}
