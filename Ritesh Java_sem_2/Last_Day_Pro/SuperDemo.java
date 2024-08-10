class Animal 
{
	private String name;

	public Animal(String name)
	{
		this.name = name ;
	}

	public void makeSound()
	{
		System.out.println("Animal Sound");
	}

	public void printName()
	{
		System.out.println("Animal = "+name);
	}
}

class Dog extends Animal
{
	private String breed;

	public Dog(String name , String breed)
	{
		super(name);
		this.breed = breed;
	}

	public void makeSound()
	{
		System.out.println("Bark");
	}

	public void printBreed()
	{
		System.out.println("Dog Breed: "+breed);
	}

	public void printNameAndBreed()
	{
		super.printName();

		printBreed();
	}
}

public class SuperDemo
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog("Dog","Lebrador");

		d1.makeSound();
		d1.printNameAndBreed();
	}
}