package com.google.patterns;
import java.util.*;
public class Pattern4nReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the rows :");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {   int count=1;
        	for(int j=n;j>=i;j--)
        	{
        		System.out.print(count +" ");
        		count++;
        		
        	}
        	System.out.println();
        }
        
	}

}
