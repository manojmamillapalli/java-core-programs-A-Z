package com.google.iterations;
import java.util.*;
public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of number ");
				int n=sc.nextInt();
				int sum=0;
				for(int i=1;i<=n/2;i++)
				{  
					
					if(n%i==0)
					{
						sum=sum+i;
					}
					
					
				}
				if(sum==n)
				{
					System.out.println("Number is a perfect number");
					}
				else
				{
					System.out.println("Not a perfect number:");
				}
			
				
				
				

	}

}
