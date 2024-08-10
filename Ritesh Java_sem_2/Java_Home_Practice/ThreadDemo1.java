class Addition extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("Hello World");
		}
	}
}

public class ThreadDemo1
{
	public static void main(String[] args)
	{
		Addition obj1 = new Addition();

		obj1.start();

		//for(int i=0;i<1000;i++)
		//{
			System.out.println("After thread: ");
		//}

		System.out.println("Final after thread ");	
	}
}