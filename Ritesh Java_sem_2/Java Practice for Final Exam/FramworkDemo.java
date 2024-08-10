import java.util.concurrent.*;

class Task implements Runnable
{
	private String name;

	public Task(String s)
	{
		name = s;
	}

	public void run()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(name+"--task-Numner---"+i);
				Thread.sleep(1000);
			}
				System.out.println(name+"completes");		
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}

public class FramworkDemo 
{
	public static void main(String[] args) {
		
		Runnable r1 = new Task("Task-1");
		Runnable r2 = new Task("Task-2");

		ExecutorService pool = Executors.newFixedThreadPool(3);

		pool.execute(r1);
		pool.execute(r2);
	}
}