import java.util.Scanner;
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
	System.out.println("Times up");
	}
}

public class TimerDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Sec: ");
		int s = sc.nextInt();

		CountDown d1 = new CountDown(s);
		d1.start();	
	}
}