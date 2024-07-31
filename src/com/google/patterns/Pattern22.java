package com.google.patterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n/2;
        int stars=1;
        for(int i=1;i<=n;i++)
        {
      	  for(int j=1;j<=spaces;j++)
      	  {
      		  System.out.print("  ");
      	  }
      	  for(int k=1;k<=stars;k++)
      	  {   
      		//if(k==stars  || k==1|| i==n/2 || k
      				//==stars/2+1)
      		//{
     		  System.out.print("*"+" ");
      		//}
      		//else
      		//	System.out.print("  ");
      	  }
      	  System.out.println();
      	  if(i>=n/2)
      	  {
      		  stars-=2;
      		  spaces++;
      	  }
      	  else
      	  {
      	  stars+=2;
      	  spaces--;
      	  }
        }

	}
//	     * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//* * * * * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 
	
	
//	   * 
//    *   * 
//  *       * 
//*           * 
//*               * 
//*           * 
//  *       * 
//    *   * 
//      * 
        

}
	
