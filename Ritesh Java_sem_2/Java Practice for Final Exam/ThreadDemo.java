class ThreadDemo1 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Good Morning");
		
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class ThreadDemo2 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Good Afternoon");

			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo
{
	public static void main(String[] args) {
		
		ThreadDemo1 td1 = new ThreadDemo1();
		Thread t1 = new Thread(td1);
		t1.start();

		ThreadDemo2 td2 = new ThreadDemo2();	
		Thread t2 = new Thread(td2);
		t2.start();


		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}