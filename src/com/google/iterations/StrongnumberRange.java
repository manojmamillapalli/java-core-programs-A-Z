package com.google.iterations;
import java.util.*;
public class StrongnumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers range to find the range of strong numbers");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			
			strong(i);
			
		}
		System.out.print(" ");

	}
	
	static void strong(int num)
	{   
		int sum=0;
		int temp=num; 	
		while(num>0)
		{   
			int rem=num%10;
			sum=sum+fact(rem);
			num=num/10;
			if(temp==sum)
				System.out.println(temp);
		}
		
		
		
	}
	static int fact(int n)
	{
		
		if(n==0)
			return 1;
		else 
		return n*fact(n-1);
	}

}
