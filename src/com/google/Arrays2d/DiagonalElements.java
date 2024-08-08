package com.google.Arrays2d;
import java.util.*;
public class DiagonalElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value:");
		int row=sc.nextInt();
		System.out.println("enter the column value:");
		int column=sc.nextInt();
		int[][] arr=new int[row][column];
		System.out.println("enter the array elements:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i+j==row-1 || i==j)
				{
			        sum+=arr[i][j];
//					System.out.print(arr[i][j]);
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			System.out.println();
		}
		System.out.println(sum);
		

	}

}
