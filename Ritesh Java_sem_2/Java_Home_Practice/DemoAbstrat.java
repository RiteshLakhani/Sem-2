public class DemoAbstrat
{
	public static void main(String[]args)
	{
		TesalCom t1 = new TesalCom();
		t1.turnLeft();
		t1.turnRight();
	}
}

abstract class tesla
{
	abstract void start();
	abstract void turnLeft();
	abstract void turnRight();
	abstract void stopped();
}

abstract class TesalImp extends tesla
{
	public void start()
	{
		System.out.println("Tesla Started");
	}

	abstract void turnRight();
	abstract void turnLeft();

	public void stopped()
	{
		System.out.println("Tesla stopped");
	}
}

class TesalCom extends TesalImp
{
	public void turnRight()
	{
		System.out.println("Tesla Turn Right");
	}

	public void turnLeft()
	{
		System.out.println("Tesla turn Left");
	}
}

