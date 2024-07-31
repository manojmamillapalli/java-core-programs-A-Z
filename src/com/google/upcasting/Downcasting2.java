package com.google.upcasting;
class Animal
{
	String name;
	public void drink()
	{
		System.out.println("Drinks water:"+this.getClass());
	}
	public void  sound()
	{
		System.out.println("All animals make the sound");
	}
	public void eats()
	{
		System.out.println("All animals eats food");
	}
}
class Dog extends Animal
{
	public void m1()
	{
		System.out.println("normal method in parent");
	}
	@Override
	public void drink()
	{
		System.out.println("dogs Drinks water:");
	}
	public void dog()
	{
		System.out.println("bow bow");
	}
	@Override
	public void  sound()
	{
		System.out.println("All dogs make the sound");
	}
	@Override
	public void eats()
	{
		System.out.println("All dogs eats food");
	}

}
class Snake extends Animal
{
	@Override
	public void drink()
	{
		System.out.println("snake Drinks water:");
	}
	@Override
	public void  sound()
	{
		System.out.println("All snake make the sound");
	}
	@Override
	public void eats()
	{
		System.out.println("All snake eats food");
	}

}
class Lion extends Animal
{
	@Override
	public void drink()
	{
		System.out.println("Lions Drinks water:");
	}
	@Override
	public void  sound()
	{
		System.out.println("All Lions make the sound");
	}
	@Override
	public void eats()
	{
		System.out.println("All Lions eats food");
	}

}
public class Downcasting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();//upcasting specific methods of sub class cannot be accessed.
		Dog d=new Dog();
		a.drink();
		//d.m1();
		a.name="Animal";
		System.out.println(a.name);
		d.name="dog";
		System.out.println(d.name);
		//Dog d=(Dog)a;//downcasting specific methods of a s
//		d.dog();
//		a.drink();
//		a.eats();
//		a.sound();
//		d.drink();
//		d.eats();
//		d.sound();
//		Animal b=new Snake();
//		Snake s=(Snake) b;
		

	}

}
