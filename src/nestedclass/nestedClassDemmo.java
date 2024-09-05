package nestedclass;

//import nestedclass.A.B;


class A
{
	public static void m2()
	{
	System.out.println("class A");
	}
	
	static class B
	{
		public void m1()
		{
		System.out.println("class b");
		}
		
		class C
		{
			public void m3()
			{
				System.out.println("class c");
			}
		}
	}
	
}
public class nestedClassDemmo {

	public static void main(String[] args) {
		A a=new A();
		//B b=new B();
		A.B b=new A.B();
		b.m1();
		
		//A.B.C c=b.new C();
        //c.m3();
       //c.m2();
       // b.accessOuterMethod();
	}

}
