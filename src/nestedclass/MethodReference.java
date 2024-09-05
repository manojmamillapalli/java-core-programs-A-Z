package nestedclass;
import java.util.*;
@FunctionalInterface 
interface I11
{
	void m1();
}
class Reference// the process of providing the existing method implementation 
//to the abstract method of functional interface is known as method reference
//:: is the method reference operator
{
	void m2()
	{
		System.out.println("method reference in the method 2");
	}
}
public class MethodReference {

	public static void main(String[] args) {
		Reference r=new Reference();
		I11 i=r::m2;//implementation is given to the object of interface
		//it can be used only in the functional interface
		i.m1();
	}

}
