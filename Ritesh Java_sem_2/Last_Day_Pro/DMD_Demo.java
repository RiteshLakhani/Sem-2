import java.util.Scanner;

class Game
{
	void type()
	{
		System.out.println("Indoor/Outdoor game");
	}
}

class Cricket extends Game
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
class Tannis extends Game
{
	void type()
	{
		System.out.println("Mix game");
	}
}

public class DMD_Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Game g1 = new Game();

		System.out.println("Enter 2 For Cricket:");
		System.out.println("Enter 3 For Badminton");
		System.out.println("Enter 4 For Tannis ");

		System.out.println("Choose Number: ");
		int ch = sc.nextInt();

		if(ch==2)
		{
			g1 = new Cricket();
		}
		else if(ch==3)
		{
			g1 = new Badminton();
		}
		else if(ch==4)
		{
			g1 = new Tannis();
		}

		g1.type();
	}
}