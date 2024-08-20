package com.google.Exceptions;

public class Exceptionprg2 {

	public static void main(String[] args) {
	 //System.out.println(10/0.0) gives an output of an infinity
		//similarly -30% 0.0 gives an output of NAN 
    Object obj=new Object();
    try
    {
    obj=null;// if we try to perform any operation on the null object then we get the null pointer exception
    System.out.println(obj.equals(obj));// throws null pointer exception
    
    }
    catch(NullPointerException e)
    {
    	System.out.println("cant do poperations on the null pointer");
    }
    System.out.println("null pointer exception");
    
	}

}
