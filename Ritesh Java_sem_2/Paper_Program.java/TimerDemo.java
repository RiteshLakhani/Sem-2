class CountDown extends Thread
{
	int sec;

	public CountDown(int sec)
	{
		this.sec = sec;
	}

	public void run()
	{
		while(sec>0)
		{
			System.out.println(sec);

			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			sec--;
		}
		System.out.println("Times Up.....");
	}
}

public class TimerDemo
{
	public static void main(String[] args) 
	{
		CountDown d1 = new CountDown(100000);
		d1.start();
	}
}