public class Mul_lab_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube c1 = new Cube();
		
		c1.display();
		c1.area();
		c1.volume();
		
	}

}

class Shape
{
	public void display()
	{
	System.out.println("Inside Display");
	}
	
}

class Reactangel extends Shape
{
	public void area() 
	{
	      System.out.println("Inside area");
	}
}

class Cube extends Reactangel
{
	public void volume()
	{
		System.out.println("Inside volume");
	}
}