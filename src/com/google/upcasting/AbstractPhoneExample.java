package com.google.upcasting;
interface Phone
{
	public default void display()
	{
		System.out.println("display main class");
	}
	public static void m1()
	{
		System.out.println("hello main class");
	}
	abstract public void on();
	abstract public void call();
}
interface CameraPhone
{
	abstract public void on();
	abstract public void takepic();
}
class NewPhone implements Phone, CameraPhone
{

	@Override
	public void takepic() {
		System.out.println("take the pic in camera Phone");
	}

	@Override
	public void on() {
		System.out.println("on the camera phone");
		
	}

	@Override
	public void call() {
		System.out.println("call the phone ");
		
	}
	
}
public class AbstractPhoneExample {

	public static void main(String[] args) {
		Phone p=new NewPhone();
		CameraPhone c=new NewPhone();
		p.on();
		p.call();
		Phone.m1();
		p.display();
		c.takepic();
		System.out.println(p instanceof Phone);

	}

	

}
