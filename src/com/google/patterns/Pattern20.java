package com.google.patterns;
import java.util.*;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int spaces=n-1;
          int stars=1;
          for(int i=1;i<=n;i++)
          {
        	  for(int j=1;j<=spaces;j++)
        	  {
        		  System.out.print("  ");
        	  }
        	  for(int k=1;k<=stars;k++)
        	  {   
//        		  if(k==1 || k==stars|| i==n)         
//        		    * 
//        	      *   * 
//        	      *       * 
//        	    *           * 
//        	  * * * * * * * * * 
//        		  {
       		  System.out.print("*"+" ");
//        		  }
//        		  else
//        			  System.out.print("  ");
        	  }
        	  System.out.println();
        	  stars+=2;
        	  spaces--;
          }
//            * 
//          * * * 
//        * * * * * 
//      * * * * * * * 
//    * * * * * * * * * 

	}

}
