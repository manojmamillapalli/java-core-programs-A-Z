package com.google.upcasting;
class Q
{
	public static void m1()
	{
		System.out.println("classs A");
	}
}
class L extends Q
{
	public static void m1()
	{
		System.out.println("classs B");
	}
}
public class MEthodhiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Q a=new L();//upcasting
  a.m1();
  
	}

}
