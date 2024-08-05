package com.google.upcasting;
class Engine
{
	String type;
    Engine(String type)
	{
		super();
		this.type=type;
	}
	public String gettype()
	{
		return type;
	}
}
class Car11
{
	Engine engine;
	Car11(String Enginetype)
	{
		super();
		this.engine=new Engine( Enginetype);	
		}
	public void getEnginetype()
	{
		System.out.println("this car has an engine type of  "+engine.gettype());
		
		
	}
}
public class Composition {

	public static void main(String[] args) {
		Car11 c=new Car11("V11");
         c.getEnginetype();
	}

}
