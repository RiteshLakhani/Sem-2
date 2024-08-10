class Vehical
{
	int maxSpeed;
	int noOfPassanger;

	public void display()
	{
		System.out.println("No of Passanger: "+noOfPassanger);
		System.out.println("Max speed: "+maxSpeed);
	}
}

class Car extends Vehical
{
	double horsePower;
	int noOfAirbags;

	public void display()
	{
		System.out.println("Horse Power: "+horsePower);
		System.out.println("No of Airbags: "+noOfAirbags);
		System.out.println("No of Passanger: "+noOfPassanger);
		System.out.println("Max speed: "+maxSpeed);
	}
} 

public class Demo1
{
	public static void main(String[] args) {
			 Vehical v = new Vehical();
			 v.maxSpeed = 80 ; 
			 v.noOfPassanger = 4;
			 System.out.println("--Vehical class---");
			 v.display();

			 Car c = new Car();
			 c.horsePower = 1.20 ; 
			 c.noOfAirbags = 2;
			 c.maxSpeed = 120;
			 c.noOfPassanger = 5;
			 System.out.println("--Car class---");
			 c.display();
	}
}