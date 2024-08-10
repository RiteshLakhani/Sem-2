public class inheritanceDemo
{
	public static void main (String[]args)
	{

		car c1 = new car();
		c1.display();
	}
}

class A 
{
	int speed = 120 ;
}

class b extends A
{
	int speed = 240;
}


class car extends A
{
	int speed = 180 ;

	void display()
	{
		int speed = 200 ;
		System.out.println("Max Speed: "+speed);
		System.out.println("Max Speed: "+this.speed);
		System.out.println("Max Speed: "+super.speed);
	}
}