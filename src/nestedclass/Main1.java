package nestedclass;
import java.util.*;
class A11
{
	void insidemethod()
	{
		class B11
		{
			void b1class()
			{
				System.out.println("B11 class");
			}
		}
		System.out.println("inside method:");
		B11 b11=new B11();
		b11.b1class();
	}
}

public class Main1 {

	public static void main(String[] args) {
		A11 a11=new A11();
		a11.insidemethod();
		

	}

}
