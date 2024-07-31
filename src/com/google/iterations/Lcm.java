package com.google.iterations;
import java.util.*;
public class Lcm
{
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int lcm=Lcmofnum(a,b,c);
		System.out.println(lcm);
	}
	static int Lcmofnum(int a, int b, int c)
	{
		int max,step,lcm=0;
		int d=(a>b)?((a>c)? a:c):((b>c))?b:c;//LCM for 3 numbers
		step=d;
		while(true)
		{
			if(d%a==0 && d%b==0 && d%c==0)
			{
				lcm=d;
				break;
			}
			d+=step;
		}
	
		return lcm;
	}
}