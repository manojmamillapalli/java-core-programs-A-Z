package lambdaExpressions;
@FunctionalInterface 
interface I1
{
	 void m1();
	
}
public class lambdaExpressionDemo {

	public static void main(String[] args) {
		I1 i=()->//when there is parameters in the function then no need of the data type
		// no need return keyword if we want to return anything
		{
			System.out.println("Lambda expression");
		};
     i.m1();
	}

}
