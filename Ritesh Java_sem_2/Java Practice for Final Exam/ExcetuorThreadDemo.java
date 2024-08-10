import java.util.concurrent.*;
class Task implements Runnable
{
	private String name;

	public Task(String name)
	{
		this.name = name;
	}

	public void run()
	{
		try
		{
			for(int i=1;i<=2;i++)
			{
				System.out.println(name+"-task Number-"+i);
				Thread.sleep(1000);
			}
			System.out.println(name+"complete");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ExcetuorThreadDemo
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Task("Task 1");
		Runnable r2 = new Task("Task 2");

		ExecutorService pool =Executors.newFixedThreadPool(3);

		pool.execute(r1);
		pool.execute(r2);

		pool.shutdown();
	}
}

