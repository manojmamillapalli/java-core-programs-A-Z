package com.google.upcasting;
class PrivateConstructor
{
	private PrivateConstructor()
	{
		System.out.println("constructor private is called");
	}
//	public static void  object()//helper methods or factory method which is only static 
//	{
//		PrivateConstructor p=new PrivateConstructor();
//	}
	// or we can also pass the return type as an object.
	public static   PrivateConstructor object()//helper methods or factory method which is only static 
	{
		return new PrivateConstructor();
	}
}
public class ConstructorPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPrivate c=new ConstructorPrivate();
		PrivateConstructor.object();
	}

}
