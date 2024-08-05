package com.google.Arrays;
import java.util.*;
public class SearchAnElementInanArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int target=3;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Search(arr,3));

	}
	public static int Search(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
			  return i;
			}
		}
		return -1;
	}

}
