package com.google.iterations;
import java.util.*;
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//square of the number last digits== the given number
		System.out.println("Enter the number to find weather it is Amorphic or not:");
		int num=sc.nextInt();
		int d=10;
		int length=String.valueOf(num).length();
		int square=num*num;
		int temp=square;
		while(length>0)
		{
			
			
			length=length/10;
			d=d*10;
		}
		int result=temp%d;
		if(result==num)
			System.out.println("Amorphic");
		else
			System.out.println("No");

	}

}
