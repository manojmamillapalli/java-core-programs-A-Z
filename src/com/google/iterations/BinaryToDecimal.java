package com.google.iterations;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the binary value to find the decimal number");
         int binary=sc.nextInt();
         int decimal=0;
         int i=1;
         while(binary>0)
         {
        	 int rem=binary%10;
        	 decimal=(rem*i)+decimal;
        	 binary=binary/10;
        	 i=i*2;
         }
         System.out.println(decimal);
	}

}
