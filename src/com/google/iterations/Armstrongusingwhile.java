package com.google.iterations;
import java.util.*;
public class Armstrongusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the number weather it is an armstong or not");
        int num=sc.nextInt();
        int temp=num;
        int length=0;
        while(num>0)
        {
        	length++;
        	num=num/10;
        }
        System.out.println(length);
       num=temp;
        int sum=0;
        
        while(num>0)
        {    int power=1;
        	int rem=num%10;
        	for(int i=0;i<length;i++)
        	{
        		power=power*rem;
        		
        	}
        	num=num/10;
        	sum=sum+power;
        	
        }
        System.out.println(sum);
        if(sum==temp)
        {
        	System.out.println("Armstrong");
        }
        else
        {
        	System.out.println("Not an armstrong");
        }
	}

}
