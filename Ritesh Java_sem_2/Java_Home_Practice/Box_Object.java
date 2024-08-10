class Car
{
	double length ; 
	double breadth ; 
	double height ; 
}

public class Box_Object
{
	public static void main(String[]args)
	{
		Car myBox1 = new Car();
		Car myBox2 = new Car();
		double vol ;


		myBox1.length = 10;
		myBox1.breadth = 20;
		myBox1.height = 30;

		myBox2.length = 2;
		myBox2.breadth = 3;
		myBox2.height = 4;

		vol = myBox1.length * myBox1.breadth * myBox1.height ; 
		System.out.println("Volume= "+vol);

		vol = myBox2.length * myBox2.breadth * myBox2.height;
		System.out.println("Volume = "+vol);
	}
}