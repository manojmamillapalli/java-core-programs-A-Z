package com.google.Exceptions;
import java.util.*;
class NotAdultException extends Exception
{
	
}
class NotValidAgeException extends Exception
{
	
}
public class CustomExceptions {

	public static void main(String[] args) throws NotValidAgeException, NotAdultException {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=21)
		{
			if(age<=35)
			{
				System.out.println("eligible");
			}
			else
			{
				throw new NotValidAgeException();
			}
		}
		else
		{
			throw new NotAdultException();
		}

	}

}
