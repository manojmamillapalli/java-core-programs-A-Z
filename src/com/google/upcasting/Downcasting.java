package com.google.upcasting;
class A
{
	int j=20;
	public void m1()
	{
		System.out.println("class A overridden property");
	}
	public void m2()
	{
		System.out.println("class A non overridden method");
	}

}
class B extends A
{
	int i=10;
	@Override 
	public void m1()
	{
		//super.m1();
		System.out.println("class B");
	}
}
class C extends A
{
	
}
class D extends A
{
	
}
public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new B();//upcasting
      //  B b=(B)a;//downcasting
      //  System.out.println(b.j);
        a.m1();
       // b.m1();
       // b.m2();
	}

}
