package com.google.Exceptions;

public class ExceptionIntro {

	public static void main(String[] args) {
		int a=10;
		try
		{
			int div=a/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			// getMessage method is from the throwable class and Exception is an sub class
			// of the throwable class
			e.printStackTrace();
			// method from the throwable class whose return type is an void
			// e.printstacktrace method prints the reason and the line at which the exception is goinfg to print
		
		}
		System.out.println(a);

	}

}
