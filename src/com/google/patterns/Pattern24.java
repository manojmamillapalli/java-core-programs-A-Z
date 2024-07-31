package com.google.patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int count=1;
	        for(int i=1; i<=n;i++)
	        {
	        	
	        	if(i%2!=0)
	        	{     //int tempCount = count + n - 1;
	        		int k=(i-1)*n+1;
	        	
	        		for(int j=1;j<=n;j++)
	        		{
	        			System.out.print(k+"  ");
//	        			count++;
//	        			tempCount--;
	        			k++;
	        		}
	        		
	        	}
	        	
	        	else
	        	{
	        		int k=i*n;
	        		for(int j=n;j>=1;j--)
	        		{
	        			System.out.print(k+ "  ");
	        			k--;
	        			
	        		}
	        		
	        		
	        	}
	        	
	        		
	        		System.out.println();	
	        		
	        	
	        }
//	        1  2  3  4  5  
//	        10  9  8  7  6  
//	        11  12  13  14  15  
//	        20  19  18  17  16  
//	        21  22  23  24  25  


	}

}
