public class MethodinheritanceDemo
{
	public static void main(String[]args)
	{
		Student s1 = new Student();

		s1.message();
		s1.display();
	}
}

class Person
{
	void message()
	{
		System.out.println("This person is class");
	}
}

class Student extends Person
{
	void message()
	{
		System.out.println("This person is Student class");	
	}

	void display()
	{
		message();
		super.message();
	}
}