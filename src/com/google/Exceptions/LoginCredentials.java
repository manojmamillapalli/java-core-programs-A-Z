package com.google.Exceptions;
import java.util.*;
class InvalidPasswordException extends Exception
{
	
}
class InvalidUsernameException extends Exception
{
	
}
public class LoginCredentials {

	public static void main(String[] args) throws InvalidPasswordException, InvalidUsernameException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name:");
		String username=sc.nextLine();
		if(username.equals("name"))
		{
			System.out.println("enter password");
			String Password=sc.nextLine();
			if(Password.equals("1234"))
			{
				System.out.println("welcome back");
			}
			else
			{
				throw new InvalidPasswordException();
				
			}
		}
		else
		{
			throw new InvalidUsernameException();
		}

	}

}
