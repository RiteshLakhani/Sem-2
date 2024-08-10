import java.util.Scanner;

class Shape
{
	public double area()
	{
		return 0;
	}
}

class Circle extends Shape
{
	private double radius;

	public  Circle(double radius)
	{
		this.radius = radius;
	}

	public double area()
	{
		return Math.PI*radius*radius;
	}
}
class Triangle extends Shape
{
	private double height;
	private double width;

	public Triangle(double height,double width)
	{
		this.height=height;
		this.width=width;
	}

	public double area()
	{
		return 0.5*height*width;
	}
}

class Square extends Shape
{
	private double side;

	public Square(double side)
	{
		this.side = side;
	}

	public double area()
	{
		return side*side;
	}
}

public class ShapeDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Radius of circle: ");
		int a = sc.nextInt();

		System.out.println("Height:");
		int b= sc.nextInt();

		System.out.println("Width:");
		int c= sc.nextInt();

		System.out.println("side:");
		int d = sc.nextInt();

		Circle c1 = new Circle(25);
		System.out.print("Circle Area: "+c1.area());
		

		Triangle t1 =new Triangle(30,58);
		System.out.print("Triangel Area: "+t1.area());

		Square s1 = new Square(72);
		System.out.print("Square Area: "+s1.area());

	}
}