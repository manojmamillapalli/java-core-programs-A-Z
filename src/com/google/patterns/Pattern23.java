package com.google.patterns;
import java.util.*;
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1; i<=n;i++)
        {
        	
        	if(i%2==0)
        	{     int tempCount = count + n - 1;
        		for(int j=n;j>=1;j--)
        		{
        			System.out.print(tempCount+"  ");
        			count++;
        			tempCount--;
        		}
        		
        	}
        	
        	else
        	{
        		for(int j=1;j<=n;j++)
        		{
        			System.out.print(count+ "  ");
        			count++;
        		}
        		
        		
        	}
        	
        		
        		System.out.println();	
        		
        	
        }
	}

}
