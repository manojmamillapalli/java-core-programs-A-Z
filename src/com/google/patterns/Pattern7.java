package com.google.patterns;
import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the n value:");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
        	 if(i%2==0)
        	 {
        		 for(int j=n;j>=1;j--)
        		 {
        			 System.out.print(j +" ");
        		 }
        		
        	 }
        	 else
        	 {
        		 for(int j=1;j<=n;j++)
        		 {
        			 System.out.print(j +" ");
        		 }
        	 }
        	 System.out.println();
         }
	}

}
