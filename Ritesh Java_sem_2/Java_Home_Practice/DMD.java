//Upcasting Demo
public class DMD
{
	public static void main(String[]args)
	{
		Phone p1 = new Iphone();
		p1.display();
	}
}

class Phone
{
	void display()
	{
		System.out.println("Phone start");
	}
}

class Iphone extends Phone
{
	void display()
	{
		System.out.println("Phone Ring");
	}
}