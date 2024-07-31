package com.google.ifelse;
import java.util.*;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("finding if the number is even or odd");
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n + " is an Even number "  );
		}
		else
		{
			System.out.println(n+" is an odd number");
		}
		
		System.out.println("If else statement execytes");
	}

}
