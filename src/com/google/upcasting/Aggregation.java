package com.google.upcasting;
class Book
{
	String name;
	Book(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		//System.out.println("The name of the book is:"+ name);
		return name;
	}
}
class Library
{
	Book book;
	public void getname(Book book)
	{
		System.out.println(book.getName());
	}
	public void getLibrary(Book book)
	{
		System.out.println(this.getClass().getSimpleName()+"has "+ book.getName());
	}
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();Book b=new Book("java");
		
		l.getname(b);
		

	}

}
