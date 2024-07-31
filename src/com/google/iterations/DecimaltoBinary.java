package com.google.iterations;
import java.util.*;
public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the binary value:");
        int num=sc.nextInt();
        int bin=0;
        int i=1;
        while(num>0)
        {
        	int bit=num%2;
        	bin=(bit*i)+bin;
        	num=num/2;
        	i=i*10;
        }
        System.out.println(bin);
	}

}
