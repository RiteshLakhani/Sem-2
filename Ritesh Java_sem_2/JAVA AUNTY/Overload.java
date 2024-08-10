import java.util.Scanner;

public class Overload
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius of Circle: ");
		double r1=sc.nextDouble();
		double ac = area(r1);
		System.out.println("Area of Circle is:"+ac);
//double ac = area(1.00);
//system.out.println("Area of Circle is:"+ac);

		System.out.println("Enter bridth of Traiangle: ");
		int b1=sc.nextInt();
		System.out.println("Enter Height of Traiangle: ");
		int h1=sc.nextInt();
		double at = area(b1,h1);
		System.out.println("Area of Circle is:"+at);
	//	double at = area(5,5);
	//	System.out.println("Area of Triangle is:"+at);

		System.out.println("Enter Length of Square: ");
		int l1=sc.nextInt();
		double as = area(l1);
		System.out.println("Area of Square is:"+as);
	//	double as = area(5);
	//	System.out.println("Area of Square is:"+as);
	}

	public static double area( double r )
	{
		return (3.14*r*r);
	}

	public static double area( int b, int h )
	{
		return (0.5*b*h);
	}

	public static double area( int l )
	{
		return (l*l);
	}

}
