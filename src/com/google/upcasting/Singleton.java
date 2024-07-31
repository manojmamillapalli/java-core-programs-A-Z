package com.google.upcasting;
class OneObject
{
	private OneObject()
	{
		System.out.println("constructor is called");
	}
	private  static OneObject t=null;
	public static OneObject objectcreation(OneObject t)
	{
//	if(t==null)
//	{
//		return t=new OneObject();
//	}
//	
//	return t;
		return (t == null) ? (t = new OneObject()) : t;

	}
}
public class Singleton {

	public static void main(String[] args) {
		OneObject o=null;
		OneObject obj1 = OneObject.objectcreation(o);
        OneObject obj2 = OneObject.objectcreation(obj1);

        // Print the result of comparing the instances
        System.out.println(obj1 == obj2); 
	}

}
