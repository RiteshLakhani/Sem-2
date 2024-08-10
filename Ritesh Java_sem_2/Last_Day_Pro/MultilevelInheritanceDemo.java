class A
{
	public void display()
	{
		System.out.println("Display");
	}
}

class B extends A
{
	public void area()
	{
		System.out.println("Inside Area");
	}
}

class C extends B
{
	public void volume(){
		System.out.println("Insdie volume");
	}
}

class D extends C
{
	public void printAll()
	{
		System.out.println("Printed....");
	}
}

public class MultilevelInheritanceDemo
{
	public static void main(String[] args) 
	{
		D d1 = new D();

		d1.display();
		d1.area();
		d1.volume();
		d1.printAll();	
	}
}