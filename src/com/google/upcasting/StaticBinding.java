package com.google.upcasting;

class Name
{
	static void f1()
	{
		System.out.println("super class:");
	}
}
class Name1 extends Name
{
	static void f1()
	{
		System.out.println("sub class:");
	}
}
public class StaticBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Name obj=new Name();
Name obj1=new Name1();
obj.f1();
obj1.f1();
	}

}
