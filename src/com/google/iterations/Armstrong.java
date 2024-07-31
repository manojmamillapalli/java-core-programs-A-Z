package com.google.iterations;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the number that need to verify as Armstrong number:");
		int   num=sc.nextInt();
		
		System.out.println(Armstrong(num));
	}
	static boolean Armstrong(int  num)
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
		return rev==temp ? true: false;
	}

}
