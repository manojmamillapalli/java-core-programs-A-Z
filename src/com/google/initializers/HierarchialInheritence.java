package com.google.initializers;

class Bank
{
//	String name;
	Bank()
	{
		System.out.println("empty constructor:");
	}
//	Bank(String name)
//	{
//		this.name=name;
//		System.out.println(name);
//	}
	public void interesrrate()
	{
		System.out.println("Interest rates in Bank:");
	}
}


class HDFC extends Bank
{
	String name;
	int rate=3;
	HDFC(String name)
	{ 
//		super("BankofBaroda");
		this.name=name;
	}
	public void nameofBank(String name)
	{
		System.out.println("Name of the bank is:"+ name);
	}
	@Override
	public void interesrrate()
	{
		super.interesrrate();
		System.out.println("Interest rates in HDFC Bank:");
	}
}


class ICICI extends Bank
{
	public void nameofBank(String name)
	{
		System.out.println("Name of the bank is:"+ name);
	}
	@Override
	public void interesrrate()
	{
		System.out.println("Interest rates in ICICI Bank:");
	}
}


class SBI extends Bank
{
	public void nameofBank(String name)
	{
		System.out.println("Name of the bank is:"+name);
	}
	@Override
	public void interesrrate()
	{
		System.out.println("Interest rates in  SBI Bank:");
	}
}


public class HierarchialInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj=new HDFC("hdfc");
		//ICICI obj1=new ICICI();
		//SBI obj2=new SBI();
		//obj.interesrrate();
		//obj1.interesrrate();
		//obj2.interesrrate();
		//obj.nameofBank("HDFC");
	}

}
