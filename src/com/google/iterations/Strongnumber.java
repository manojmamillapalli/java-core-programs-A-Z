package com.google.iterations;
import java.util.*;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sum of factorial of each digit of a number is equal to the given number.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find weather it is a strong number or not:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num; 	
		while(num>0)
		{   
			int rem=num%10;
			sum=sum+fact(rem);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Strong number");
		else
			System.out.println("Not a strong");
		
	}
	
	static int fact(int n)
	{
		
		if(n==0)
			return 1;
		else 
		return n*fact(n-1);
	}

}
