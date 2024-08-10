interface VehicalDemo
{
	int a = 10 ;

	public void turnLeft();
	public void turnRight();
	public void speedUp();
	public void speedDown(); 
}

class Car implements VehicalDemo
{
	@Override
	public void turnLeft()
	{
		System.out.println("turnLeft");
	}

	@Override
	public void turnRight()
	{
		System.out.println("turnRight");
	}

	@Override
	public void speedUp()
	{
		System.out.println("SpeedUP");
	}

	@Override
	public void slowDown()
	{
		System.out.println("Break");
	}
}

public class InstanceDemo
{
	public static void main(String[] args) {
		

		Car c1 = new Car();
		c1.turnLeft();
	}
}