package com.google.Exceptions;

public class NumberFormatException {

	public static void main(String[] args) {
		// we can convert integer to string
		// but we cannot convert string to integer.
		//when such type of impossible conversions throw an numberformat exception.
		String s="abc";
		int i=Integer.parseInt(s);
		System.out.println(s);// need to deep study on the number format exception 
		//when we dont know what type of the exception raises in the try block 
		//then we need to pass the parameter of the catch block as
		//catch(Exception e)
//		{
//			e.printstacktrace();
//		}
		
	}
	

}
