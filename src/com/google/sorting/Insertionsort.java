package com.google.sorting;
import java.util.*;
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int[] arr= {13,46,24,52,40,20,9};
        for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
        System.out.println("After sorting the array:");
        Insertion(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i] +" ");
        }
        
	}
	static void Insertion(int[] arr, int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			int j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		
	}

}
