class MyThread1 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Good Morning");

			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println("Good Afternoon");

			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Demo5
{
	public static void main(String[] args)
	{
		MyThread1 t1 = new MyThread1();
		Thread tr = new Thread(t1);
		tr.start();

		MyThread2 t2 = new MyThread2();
		Thread td = new Thread(t2);
		td.start();

		try{
			tr.join();
			td.join();
		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}