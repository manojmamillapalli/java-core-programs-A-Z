package com.google.upcasting;
 class Detains
 {
	private int id;
	private String name;
	private int rollno;
	private int yop;
	// alternate way for generating getter and setter methods are
	//under the data members declaration right click the mouse->sources->setter and getter methods generate.
	//we will get all the getter and setter methods 
	//as the constructor is a private constructor.we need to create object to call that constructor
	//but we cannot create a object inside the class
	// so create an public method which will return the object of the class
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getYop() {
		return yop;
	}


	public void setYop(int yop) {
		this.yop = yop;
	}


	public void display()
	{
		System.out.println("name is"+name);
		System.out.println("rollno is"+rollno);
		System.out.println("yop  is"+yop);
		System.out.println(id);
	}
 }
public class Student {

	public static void main(String[] args) {//encapsulation 
		Detains d=new Detains();
		d.display();
		d.setId(8);
		System.out.println(d.getId());
		d.display();

	}

}
