public class ThreadPriorityDemo extends Thread
{
	public ThreadPriorityDemo(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			try
			{
				sleep(200);
				System.out.println("Call of "+this.getName()+i);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}			
		}
	}

	public static void main(String[] args)
	{
			
		ThreadPriorityDemo t1 = new ThreadPriorityDemo("Low");
		t1.setPriority(Thread.MIN_PRIORITY);

		//ThreadPriorityDemo t2 = new ThreadPriorityDemo("MID");
		//t2.setPriority(Thread.NORM_PRIORITY);

		//ThreadPriorityDemo t3 = new ThreadPriorityDemo("HIGH");
		//t3.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		//t2.start();
		//t3.start();
	}
}