package com.google.upcasting;
abstract class Shape
{
	String color;
	abstract public  int area();
	abstract public void display();
	Shape(String color)
	{
		this.color=color;
		System.out.println("The color constructor in super class"+ color);
	}
	
}
class Rectangle extends Shape
{
    String color;
    int length;
    int breadth;
	Rectangle(String color, int length, int breadth) {
		super(color);
		this.color=color;
		this.length=length;
		this.breadth=breadth;
		System.out.println("rectangle constructor:");
	}

	@Override
	public int area() {
		int area=length*breadth;
		System.out.println(area);
		return area;
	}

	@Override
	public void display() {
		System.out.println("rectangle color is"+ color);
		System.out.println("rectangle length is"+ length);
		System.out.println("rectangle breadth is"+ breadth);
	}
	
}
class Circle extends Shape
{
    int radius;
    String  color;
	Circle(String color, int radius) {
		super(color);
		this.color=color;
		this.radius=radius;
	}

	@Override
	public int area() {
	     int area=(int)3.47*radius*radius;
	     System.out.println("area of the circle is"+area);
		return area;
	}

	@Override
	public void display() {
		
		System.out.println("circle color is"+ color);
		System.out.println("circle radius is"+ radius);
	}
	
}
public class AreaAbstractionExample {

	public static void main(String[] args) {
		Shape s=new Rectangle("blue", 3,4);
		Shape s1=new Circle("yellow", 3);
		s.area();
		s.display();
		s1.area();
		s1.display();
		System.out.println("Downcasting output:");
		Rectangle r1=(Rectangle)s;
		Circle c=(Circle)s1;
		r1.area();
		r1.display();
		c.area();
		c.display();

	}

}
