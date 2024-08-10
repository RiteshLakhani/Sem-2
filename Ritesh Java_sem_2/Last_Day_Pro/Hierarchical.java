class A 
{
	int salary = 4000;

	public void display()
	{
		System.out.println("Salary: "+salary);
	}
}

class B extends A
{
	double bonus = 2.5;

	public void displayPer()
	{
		System.out.println("New Salary: "+(salary*bonus)+salary);
	}
}

class C extends A
{
	double bonus = 0.5;

	public void displayInc()
	{
		System.out.println("Pemenet Salary: "+(salary*bonus)+salary);
	}
}

public class Hierarchical
{
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.display();
		b1.displayPer();

		C c1 = new C();
		c1.display();
		c1.displayInc();
	}
}