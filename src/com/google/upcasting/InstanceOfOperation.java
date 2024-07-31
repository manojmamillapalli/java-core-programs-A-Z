package com.google.upcasting;
class B2 {
    // Some properties and methods
}

class A2 extends B2 {
    // Some properties and methods
}


public class InstanceOfOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object obj=new Object();
//		B b=new B();
//		A a=new A();
//		System.out.println(b instanceof Object);
//		System.out.println(a instanceof Object);
//		System.out.println(a instanceof B);
//		System.out.println(b instanceof A);
//		System.out.println(a instanceof A);
//		System.out.println(obj instanceof Object);
//		Object o=new B();
//		System.out.println(o instanceof Object);
//		System.out.println(o instanceof B);
//		System.out.println(o instanceof A);
		Object o=new B2();
		System.out.println(o instanceof Object);
		System.out.println(o instanceof B2);
		System.out.println(o instanceof A2);
		B2 b=(B2)o;
		System.out.println(o instanceof Object);
		System.out.println(o instanceof B2);
		System.out.println(o instanceof A2);
		Object o1=new A2();
		System.out.println(o1 instanceof Object);
		System.out.println(o1 instanceof B2);
		System.out.println(o1 instanceof A2);
		A2 o2=(A2)o1;
		System.out.println(o2 instanceof Object);
		System.out.println(o2 instanceof B2);
		System.out.println(o2 instanceof A2);
		

	}

}
