package com.google.initializers;
//************************single Inheritence***************************//
class Textmessages// super class
{
	void textmessages()
	{
		System.out.println("Text messages:");
		}
}
class Emojimessages extends Textmessages//sub class extending the properties of super class
{
	void emojimessages()
	{
		System.out.println("emojimessages:");
	}
}

public class Initializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emojimessages obj=new Emojimessages();// object created for the sub class
		obj.emojimessages();
	}

}
