package com.google.oops;
class Animal
{
	public Animal getAnimal()//return type is non-primitive
	{
		System.out.println(this.getClass());
		return this;
		}
}
class Dog extends Animal
{
	@Override
	public Dog getAnimal(){//return type is contravariant
		super.getAnimal();
		System.out.println(this.getClass());
		return this;
	}
}

public class CovariantContravariant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog obj1=new Dog();
obj1.getAnimal();
	}

}
