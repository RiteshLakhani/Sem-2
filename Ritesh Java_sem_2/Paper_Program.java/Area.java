public class Area 
{
	public static void main(String[]args)
	{
		Demo d1 = new Demo(5);

		System.out.println("Area of the Circle is: "+d1.AreaPrint());
	}
}

class Demo
{
	int r;

	public Demo(int r)
	{
		this.r=r;
	}

	public double AreaPrint()
	{
		return 3.14*r*r;
	}
}