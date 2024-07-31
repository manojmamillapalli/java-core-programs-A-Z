package com.google.iterations;
import java.util.*;
public class Swicase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int m=sc.nextInt();
		char  ch= sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			System.out.println("Addition:" + ( n+m));
			break;
		case '-':
			System.out.println("subctraction:" + (n-m));
			break;
		case '*':
			System.out.println(" Multiplication:" +(n*m));
			break;
		case '/':
			System.out.println(" Divided:" +(n/m));
			break;
		case '%':
			System.out.println(" Modulo:" +(n%m));
			break;
		
			default:
				System.out.println("Default case");
		}

	}

}
