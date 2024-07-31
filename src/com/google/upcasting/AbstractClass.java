package com.google.upcasting;

abstract class A11
{
	int i=1;
	A11(int i)
	{
		this.i=i;
		System.out.println(i);
	}
	abstract public void m1();
	abstract public int m2();
	public void m3()
	{
		System.out.println("complete function in a class");
	}
}
class B11 extends A11
{
	int j;
	
	B11(int i, int j)
	{
		super(10);
		this.j=j;
		System.out.println(i+" "+j);
	}
	public void m1()
	{
		System.out.println("m1() B class");
	}
	public int m2()
	{
		System.out.println("m2() method in B class"+ j);
		return j;
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A11 obj=new B11(9,3);
System.out.println(obj.i);
obj.m1();
obj.m2();
obj.m3();
B11 obj1=(B11)obj;
obj1.m1();
obj1.m3();
System.out.println(obj1.i);
	}

}
