package com.google.patterns;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of rows and columns");
        int rows=sc.nextInt();
         int col=sc.nextInt();
         for(int i=1;i<=rows;i++)
         {
        	 for(int j=1;j<=rows;j++)
        	 {
        		 if(i==j || i+j==rows+1 )
        		 {
        			 System.out.print(" "+" ");
        			 
        		 }
        		 else if(i==1||j==1||i==rows||j==rows)
        		 {
        			 System.out.print("*"+" ");
        		 }
        		 else
        			
        		 System.out.print("*"+ " ");
        		 
        	 }
        	 System.out.println();
         }
//           * * * * * * *   
//         *   * * * * *   * 
//         * *   * * *   * * 
//         * * *   *   * * * 
//         * * * *   * * * * 
//         * * *   *   * * * 
//         * *   * * *   * * 
//         *   * * * * *   * 
//           * * * * * * *   

         //make the 4 triangles hallow.

	}

}
