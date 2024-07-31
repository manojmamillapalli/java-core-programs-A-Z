package com.google.upcasting;
class Car
{   int i=2;
	public void drive(Car c)
	{
		System.out.println(this.getClass().getSimpleName()+ "is running");
	}
	public void speed()
	{
		System.out.println("car is running:");
	}
}
class Audicar extends Car
{
	@Override
	public void speed()
	{
		System.out.println("Audycar is running:");
	}
}
class Feraricar extends Car
{
	@Override
	public void speed()
	{
		System.out.println("Feraricar is running:");
	}
}
class Benzcar extends Car
{ int j=5;
	@Override
	public void speed()
	{
		super.speed();
		System.out.println("Benz is running:");
	}
}
public class Upcasting {
public static void main(String[] args)
{
	Car c1=new Benzcar();
	c1.drive(c1);
	c1.speed();
	System.out.print(c1.i);
}
}
