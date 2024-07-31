package com.google.operators;
import java.util.*;
public class Evennum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check even or odd");
				int  num=sc.nextInt();;
				boolean ans=(num%2==0)?true:false;
				System.out.println(ans);
				

	}

}
