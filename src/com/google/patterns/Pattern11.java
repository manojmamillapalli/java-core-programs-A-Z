package com.google.patterns;
import java.util.*;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the row value:");
  int n=sc.nextInt();
//1 2 3 4 5
//2 3 4 5 
//3 4 5
//4 5
//5
  for(int i=1;i<=n;i++)
  {
	  for(int j=i;j<=n;j++)
	  {
		  System.out.print(j+ " ");
	  }
	  System.out.println();
  }
	}

}
