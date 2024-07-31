package com.google.patterns;
import java.util.*;
public class patter3n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to print a patterm");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
	}

}
