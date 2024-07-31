package com.google.iterations;
import java.util.*;
public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to be reversed:");
            int num=sc.nextInt();
            int temp=num;
            int rev=0;
            while(num>0)
            {
            	int rem=num%10;
            	rev=(rev*10)+rem;
            	num=num/10;
            }
            System.out.println(rev);
            if(temp==rev)
            {
            	System.out.println(temp +"  is a palindrome:");
            }
           
            
	}

}
