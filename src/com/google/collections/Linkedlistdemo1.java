package com.google.collections;
import java.util.*;
class A
{  A()
	{
	System.out.println("abandon object");
	}
public void display()
{
	System.out.println("display method");
}
}
public class Linkedlistdemo1 {

	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a.hashCode());
	    a=new A();
	    System.out.println(a.hashCode());
	    a.display();
	}

}
