package com.google.iterations;
import java.util.*;
public class Xylem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9999 last two digits sum and middle digits sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find weather it is xlem or pholem");
		int num=sc.nextInt();
		int temp=num;
		int last_digit=num%10;
		num=num/10;
		int sum1=0;
		int sum2=0;
		while(num>9)
		{
			int rem=num%10;
			sum2=sum2+rem;
			num=num/10;
		}
		
		sum1=last_digit + num;
		if(sum1==sum2)
			System.out.println("Xylem number");
		else
			System.out.println("phloem number");

	}

}
