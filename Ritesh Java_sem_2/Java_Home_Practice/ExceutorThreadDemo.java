import java.util.concurrent.*;

class Task implements Runnable
{
	private String name;

	public Task(String s)
	{
		name = s ;
	}

	public void run()
	{
		try
		{
			for(int i=1 ; i<=5; i++)
			{
				System.out.println(name+"-task number"+i);
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

public class ExceutorThreadDemo
{
	public static void main(String[] args) {
		
		Runnable r1 = new Task("task 1");
		Runnable r2 = new Task("task 2");
		Runnable r3 = new Task("task 3");
		Runnable r4 = new Task("task 4");
		Runnable r5 = new Task("task 5");

		ExecutorService pool = Executors.newFixedThreadPool(3);

		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);

		pool.shutdown();

	}
}