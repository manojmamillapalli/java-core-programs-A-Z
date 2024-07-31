package com.google.upcasting;
class Girl
{
	static void f1()
	{
		System.out.println("super class  static method:");
	}
	void f2()
	{
		System.out.println("super class non static method:");
	}
}
class Boy extends Girl
{
	static void f1()
	{
		System.out.println("sub class  static method:");
	}
	@Override 
	void f2()
	{
		System.out.println("sub class non static method:");
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl obj=new Girl();
		Girl obj1=new Boy();
		Boy obj2=new Boy();
		obj.f1();
		obj.f2();
		obj1.f1();
		obj1.f2();
		obj2.f1();
		obj2.f2();
	}

}
