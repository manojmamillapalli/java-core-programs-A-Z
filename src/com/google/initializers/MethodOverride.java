package com.google.initializers;
class A1
{
	public void m1()
	{
		System.out.println("Super class method:");
	}
}
class B1 extends A1
{   
	@Override
	public void m1()
	{
		System.out.println("sub class method:");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B1 obj=new B1();
        obj.m1();
	}

}
