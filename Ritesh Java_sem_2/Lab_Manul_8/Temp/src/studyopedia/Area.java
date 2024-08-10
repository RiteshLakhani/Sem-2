
public class Main 
{
	public static void main(String[]args)
	{
		Circle c = new Circle(5);
        Triangle t = new Triangle(3, 4);
        Square s = new Square(2);
        
        System.out.println("Circle area: " + c.area());
        System.out.println("Triangle area: " + t.area());
        System.out.println("Square area: " + s.area());
	}
}

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
	public void double area()
	{
		return Math.PI * radius * radius;
	}
}

class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public double area() {
        return side * side;
    }
}