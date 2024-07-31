package com.google.patterns;
import java.util.*;
public class Pattern26 {

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
		   System.out.print("*"+" ");
	   }
	   System.out.println();
	   if(i>n/2)
	   {
		   stars--;
		   spaces++;
	   }
	   else
	   {
		   stars++;
		   spaces--;
	   }
   }
	}

}
