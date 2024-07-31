package com.google.operators;
import java.util.*;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a, b,, c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int e=(a>b)? a:b;
		System.out.println("The biggest among two"+ e);
		int c=sc.nextInt();
		//int d=c>((a>b)?a:b)?c:((a>b)?a:b);
		int d=(a>b)?((a>c)? a:c):((b>c))?b:c;
		int d1=(a<b)?((a<c)? a:c):(b<c)?b:c;// smallest value ampng three
		/*Here first we write  (a>b)?a:b This condition return
		either a or b. If the value is a then we need to compare that with value c.
		and after the ? we have to write the possible outcome i.e; either c or value
		 that (a>b)?a:b returns */
		System.out.println("The greatest value is" + d);
		System.out.println("The smallest value is" + d1);
		
		

	}

}
