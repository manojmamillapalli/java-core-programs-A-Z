package com.google.upcasting;
interface Functional
{
	abstract int sum(int a, int b);
}
class CalculatorinMobile implements Functional
{
	@Override
	public int sum(int a, int b) {
		int sum1=a+b;
		System.out.println(this.getClass().getSimpleName()+" Sum is "+ sum1);
		return sum1;
	}
	public int mul1(int a, int sum)
	{  
	int mul=a*sum;
	 System.out.println("CAlculator in mobile mul is:"+ mul);
		return mul;
		
	}
}
	class Actualcalculator implements Functional
	{
		@Override
		public int sum(int a, int b) {
			int sum2=a+b;
			System.out.println(this.getClass().getSimpleName()+" sum is "+sum2);
			return sum2;
		}
		
	}

public class FunctionalInterface {

	public static void main(String[] args) {
		Functional f=new CalculatorinMobile();
		f.sum(1, 2);
		Functional f1=new Actualcalculator();
		f1.sum(2, 3);
		CalculatorinMobile m=(CalculatorinMobile)f;
		m.mul1(3,f.sum(1, 2));
		
		
	}

}
