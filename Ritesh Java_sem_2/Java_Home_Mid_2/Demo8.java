final class Bike
{
	public void run()
	{
		System.out.println("Nice");
	}
}

class Motor extends Bike
{
	public void run()
	{
		System.out.println("Hello");
	}
}

public class Demo8
{
	public static void main(String[] args) {
		
		Motor m1 = new Motor();
		m1.run();
	}
}