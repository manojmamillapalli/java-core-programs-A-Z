package com.google.patterns;
import java.util.*;
public class PatternCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++)
        {
        	for(int j=0;j<2*n-1;j++)
        	{
        		int top=i;
        		int bottom=j;
        		int right=(2*n-2)-j;
        		int left=(2*n-2)-i;
        		 System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
        	}
        	System.out.println();
        }
	}

}
