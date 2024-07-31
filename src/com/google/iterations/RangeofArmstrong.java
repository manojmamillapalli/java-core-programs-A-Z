package com.google.iterations;
import java.util.*;
public class RangeofArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of numbers to find the armstrong numbers");
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
        	Armstrong(i);
        	System.out.print(" " );
        }
	}
	static void  Armstrong(int  num)
	// sum of power of each digit of a number
	{   int temp=num;
		int  rev=0;
		int   k=String.valueOf(num).length();
		while(num>0)
		{   
			double   rem=num%10;
			rev=(int)Math.pow(rem, k)+rev;
			num=num/10;
			
		}
		if(rev==temp)
			System.out.print(rev);
		
		
	}

}
