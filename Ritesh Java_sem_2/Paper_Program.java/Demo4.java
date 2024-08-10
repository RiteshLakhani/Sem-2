class Thread1 extends Thread
{
	public void run()
	{
		
		while(true)
		{
			System.out.println("Hello world");
		

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

public class Demo4
{
	public static void main(String[] args) 
	{
		 Thread1 t1 = new Thread1();
		 t1.start();

		 Thread1 t2 = new Thread1();
		 t2.start();

		 try{
		 	t1.join();
		 	t2.join();
		 }
		 catch(Exception e)
		 {
		 	e.printStackTrace();
		 }	
	}
}