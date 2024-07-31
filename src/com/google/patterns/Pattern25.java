package com.google.patterns;
import java.util.*;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int stars=1;
		int spaces=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*"+"  ");
			}
			for(int k=1;k<=spaces;k++)
			{
				System.out.print("  ");
			}
			System.out.println();
			if(i>n/2)
			{
				stars--;
				spaces++;
			}
			else
			{
				stars++;
				spaces--;
			}
		}// need to print right and left pyramid

	}

}
