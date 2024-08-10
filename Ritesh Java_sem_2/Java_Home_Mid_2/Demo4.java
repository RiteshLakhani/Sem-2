public class Demo4
{
	public static void main(String[] args) {
	
		Student s1 = new Student();
		//s1.message();
		s1.display();	
	}
}

class Person
{
	void message()
	{
		System.out.println("A");
	}
}

class Student extends Person
{
	void message()
	{
		System.out.println("B");
	}

	void display()
	{
		message();
		super.message();
	}
}