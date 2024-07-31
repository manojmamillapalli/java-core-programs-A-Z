package Polymorphism;
interface Sim
{
	abstract  void CallConnect();
}
class Jio implements Sim
{

	@Override
	public void CallConnect() {
		System.out.println("jio phone connects:");
		// no effect when we cause any change to the sub class 
	}
	
}
class Airtel implements Sim
{

	@Override
	public void CallConnect() {
		System.out.println("airtel phone connects:");
		
	}
	
}
class Phones
{
	Sim sm;
	public void CallSim(Sim obj)
	{
		System.out.println("call connected");
		obj.CallConnect();
		System.out.println(obj.getClass().getSimpleName()+"having network");
	}
}
public class LooseCoupling {

	public static void main(String[] args) {
		Sim s=new Jio();
Phones ph=new Phones();
ph.CallSim(s);
	}

}
