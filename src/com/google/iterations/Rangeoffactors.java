package com.google.iterations;
import java.util.*;
public class Rangeoffactors {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start of the number");
        int start=sc.nextInt();
        System.out.println("Enter the end of the number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
        	System.out.print("Factors  of " + i + " is  :");
        	for(int j=1;j<=i/2;j++)
        	{
        		if(i%j==0)
        		{
        			
        			System.out.print(j + ", ");
        		}
        	
        	}
        	System.out.println();
        }
	}

}
