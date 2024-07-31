package com.google.oops;
import java.util.*;
public class Rectangle {
	int length;
	int breadth;
	Rectangle(int n)
	{
		this.length=n;
		this.breadth=n;
	}
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public int  Area()
	
	{
		int area=length*breadth;
		 return area;
	}
public int  perimeter()
	
	{
		int perimeter=2*(length+breadth);
		 return perimeter;
	}// area and perimeter of the rectangle using an constructor.
	public static void main(String args[])
	{
		Rectangle area=new Rectangle(5,4);
		Rectangle a=new Rectangle(3);
		System.out.println(area.Area());
		System.out.println(area.perimeter());
		System.out.println(a.Area());
		System.out.println(a
				.perimeter());
	}
}

