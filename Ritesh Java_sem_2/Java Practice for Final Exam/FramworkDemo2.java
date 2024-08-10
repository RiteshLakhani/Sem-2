import java.util.concurrent.*;

class Task implements Runnable
{
	private String name;

	Task(String n)
	{
		name = n;
	}

	public void run()
	{
		
		try{
			for(int i=1;i<=3;i++)
			{
				System.out.println(name+"--task number--"+i);
				Thread.sleep(100);
			}
			System.out.println(name+"completes");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class FramWorkDemo2
{
	public static void main(String[] args)
	{
		Runnable r1 = new Task("task-1");
		Runnable r2 = new Task("task-2");
		Runnable r3 = new Task("task-3");

		ExecutorService pool = Executors.newFixedThreadPool(3);

		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
	}
}