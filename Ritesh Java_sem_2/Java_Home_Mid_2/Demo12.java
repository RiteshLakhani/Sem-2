class Shape
{
	public double area()
	{
		return 0 ;
	}
}

class Circle extends Shape
{
	private double radius;

	public Circle(double radius)
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
	private double base;

	public Triangle(double height, double base)
	{
		this.base = base;
		this.height = height;
	}  

	public double area()
	{
		return 0.5*height*base;
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

public class Demo12
{
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		Triangle t1 = new Triangle(8,7);
		Square s1 = new Square(4);

		System.out.println("Area of Circle is "+c1.area());
		System.out.println("Area of Triangle is "+t1.area());
		System.out.println("Area of Square is "+s1.area());

	}
}