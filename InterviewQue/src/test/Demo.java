package test;


class Animal
{
	public void eat()
	{
		System.out.println("animal eating");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("dog eating");
	}
}


public class Demo {
	
	public static void main(String arg[])
	
	{
		System.out.println("welcome..");
		Animal a;
		a=new Animal();
		a.eat();
		a=new Dog();
		a.eat();
		
		Dog d=new Dog();
		d.eat();
		
	
		
		
	}

}
