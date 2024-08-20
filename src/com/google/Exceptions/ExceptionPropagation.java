package com.google.Exceptions;
import java.util.*;
class InvalidAgeException extends Exception
{
	
}
public class ExceptionPropagation {

	public static void main(String[] args) throws InvalidAgeException
	{
		Scanner sc=new Scanner(System.in);
		m1();

	}
	public static void m1() 
	{
		m2();
		
	}
	public static void m2() {
		m3();
		
	}
	public static void m3()  {
		new InvalidAgeException();
		
	}

}
