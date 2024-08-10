import java.util.Scanner;

class Game
{
	void type()
	{
		System.out.println("Indoor/Outdoor");
	}
}

class cricket extends Game
{
	void type()
	{
		System.out.println("Outdoor");
	}
}

class Badminton extends Game
{
	void type()
	{
		System.out.println("Indoor");
	}
}

class FootBall extends Game
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


public class Demo9
{
	public static void main(String[] args) {
		
		Game g1 = new Game();

		Scanner sc = new Scanner(System.in);

		System.out.println("2 for cricket");
		System.out.println("3 for Badminton");
		System.out.println("4 for FootBall");
		System.out.println("5 for Tannis");

		System.out.println("Choose Number: ");
		int a = sc.nextInt();

		if(a==2)
		{
			g1 = new cricket();
		}
		else if(a==3)
		{
			g1 = new Badminton();
		}
		else if(a==4)
		{
			g1 = new FootBall();
		}
		else if(a==5)
		{
			g1 = new Tannis();
		}

		g1.type();
	}
}