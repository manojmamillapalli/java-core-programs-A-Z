package com.google.upcasting;
interface Washable
{
	
}
class Bike implements Washable
{
	
}
class Car1 implements Washable
{
	
}
class TV
{
	
}
class Washerman
{
	public void wash(Object l)
	{
		if(l instanceof Washable)
		{
			System.out.println(l.getClass().getSimpleName()+" is a washable");
		}
		else
		{
			System.out.println("not washable");
		}
	}
}
public class MarkedInterface {

	public static void main(String[] args) {
		Washable b=new Bike();
		Washable c=new Car1();
		Washerman obj=new Washerman();
		obj.wash(b);
		obj.wash(c);
		TV t=new TV();
		obj.wash(t);
		
		

	}

}
