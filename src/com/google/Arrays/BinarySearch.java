package com.google.Arrays;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int start=0;
		int end=arr.length-1;
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target:");
		int target=sc.nextInt();
		System.out.println(Binary( arr,  start,  end,  target));
		System.out.println(Arrays.tostr)

	}
	 static int Binary(int[] arr, int start, int end, int target)
	{
		 start=0;
		 end=arr.length-1;
		while(start<=end)
		{
		int mid=start+(end-start)/2;
		if(target>arr[mid])
		{
			start=mid+1;
		}
		else if(target<mid)
		{
			end=mid-1;
		}
		else 
		{

			return mid;
		}
		}
		return -1;
		
	}

}
