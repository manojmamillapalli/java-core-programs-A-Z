package com.google.Arrays;

import java.util.Scanner;

public class SecondSmallestElementInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int target=3;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(SecondSmallest(arr));
	}
	public static int SecondSmallest(int[] arr)
	{
		int smallest=arr[0];
		int secondsmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{   secondsmallest=smallest;
				smallest=arr[i];
			}
			if(arr[i]<secondsmallest && arr[i]>smallest)
			{
				secondsmallest=arr[i];
			}
		}
		return secondsmallest;
	}

}
