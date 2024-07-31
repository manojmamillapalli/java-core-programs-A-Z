package com.google.interfaces;
interface Switch
{
	abstract void in();
	abstract void off();
}
class Fan implements Switch
{

	@Override
	public void in() {
		System.out.println("fan is on");
		
	}

	@Override
	public void off() {
		System.out.println("Fan is off");
		
	}
}
	class Bulb implements Switch
	{

		@Override
		public void in() {
			System.out.println("Bulb is on");
			
		}

		@Override
		public void off() {
			System.out.println("Bulb is off");
			
		}
		
	}
	

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch s=new Bulb();
		Switch s1=new Fan();
		s.in();
		s.off();
		s1.in();
		s1.off();
           
	}

	

}
