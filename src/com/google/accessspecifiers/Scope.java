package com.google.accessspecifiers;
 class Classparent
{
	public int i=10;
	private int priv=20;
	protected int prot=70;
	private void display()
	{
		System.out.println(i);
	}
	
}
public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classparent cp=new Classparent();
	}

}
