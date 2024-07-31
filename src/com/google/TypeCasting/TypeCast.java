package com.google.TypeCasting;

public class TypeCast {
	
public static void main(String[] args)
{   //_________________________________________________widening>>>>
	//Byte->Short->Char->int->Long->Float->Double
	//<<<<<<<<<<<<Narrowing________________________________________________________
	int a=10;
	// convert the int to double
	double b= a;//implicit typecasting
	System.out.println(b);
	System.out.println((double)a);//Explicit typecasting
	//converting the int to the short type
	short c=(short)a;
	System.out.println(c);
	char ch='d';
	/* we can also assign a ASCII value to char so that it prints its character
	char ch=27;
	System.out.println(ch);
	the output is ? (ASCII value of ?=27)*/
	System.out.println(ch);
	int i= ch;// assign a char value to int type to gain its ASCII value
	System.out.println(i);
	float f=10.8f;
	long l=(long)f;
	/* Conversion from float to long is not possible implicitly because
	 *  precision will be greater than long for float
	 * so that there may be loss of digits after the decimal in long.
	 *  So we need to convert them explicitly*/
	 
	System.out.println(l);
	}
}
