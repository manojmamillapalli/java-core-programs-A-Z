package lambdaExpressions;
abstract class Demo1
{
	abstract void m1();

	abstract void m2();
		
	
	abstract void m3();
}
public class AbstractLambdaDEmo {

	public static void main(String[] args) {
		Demo1 d=new Demo1()// anonymous block
				{

					@Override
					void m1() {
						System.out.println("method1 from the abstract class");
						
					}
					@Override
					public void m3()
					{
						System.out.println("m3 method of the abstract");
					}
					@Override
					public void m2()
					{
						System.out.println("m2 in the method");
					}
			
				};
			
				d.m1();
				d.m2();
				d.m3();
				

	}

}
