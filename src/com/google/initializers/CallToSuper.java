package com.google.initializers;

class A
{
	int i=10;
	int j;
//	A()
//	{   
//		System.out.println("constructor without parameters");
//	}
	A(int i, int j)
	{   
		
		this.i=i;
		this.j=j;
		System.out.println(i);
		System.out.println(j);
	}
	
}
class B extends A
{
//	int i;
//	int j;
//	B(int i, int j)
//	{
//		this.i=i;
//		this.j=j;
//		System.out.println(i);
//		System.out.println(j);
//	}
	B()
	{
		super(20,30);
		System.out.println(i);
		System.out.println(j);
	}
	public void b1()
	{
		System.out.println(super.i+"hi");
	}
	
}
public class CallToSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // B obj=new B(12,13);
   //obj.b1();
   B obj1=new B();
   obj1.b1();
//   B obj2=new B(1,2);
	}

}
