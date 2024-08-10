import java.util.Scanner;

public class DMD_DEMO
{
	public static void main(String[]args)
	{
		Game g1 = new Game();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 for Cricket");
		System.out.println("Enter 3 for Badminton");
		System.out.println("Enter 4 for Football");
		System.out.println("Enter 5 for Tannis");

		System.out.print("Choose Number: ");
		int a = sc.nextInt();

		if(a==2)
		{
			g1= new Cricket();
		}
		else if (a==3)
		{
			g1 = new Badminton();
		}
		else if (a==4)
		{
			g1 = new Football();
		}
		else if(a==5)
		{
			g1 = new Tannis();
		}

		g1.type();
	}
}
class Game
{
	void type()
	{
		System.out.println("Indoor/Outdoor");
	}
}

class Cricket extends Game
{
	void type()
	{
		System.out.print("Outdoor");
	}
}

class Badminton extends Game
{
	void type()
	{
		System.out.println("Indoor");
	}
}

class Football extends Game
{
	void type()
	{
		System.out.println("Outdoor");
	}
}

class Tannis extends Game
{
	void type()
	{
		System.out.println("Mix game");
	}
}