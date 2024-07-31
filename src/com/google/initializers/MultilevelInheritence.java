package com.google.initializers;
class Phone{
	public void Phonecall()
	{
		System.out.println("only phone call");
		}
}
	class Camera extends Phone
	{
		public void camera()
		{
			System.out.println("camera:");
		}
	}
	class Smart extends Camera
	{
		public void smartphone()
		{
			System.out.println("smart phone:");
		}
	}

public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Smart obj=new Smart();
      obj.Phonecall();
	}

}
