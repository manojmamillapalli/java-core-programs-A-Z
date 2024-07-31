package com.google.iterations;
import java.util.*;
public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the base and th exponent value");
   int base=sc.nextInt();
   int exponent=sc.nextInt();
   int power=1;
   for(int i=0;i<exponent;i++)
   {
	   power=power*base;
   }
   System.out.println(power);
	}

}
