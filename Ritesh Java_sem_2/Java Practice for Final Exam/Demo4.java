import java.util.Scanner;

class ThreadExtend1 extends Thread
{
	int odd;

	ThreadExtend1(int odd)
	{
		this.odd=odd;
	}

	public void run()
	{
	try{

		for(int i=0;i<=odd;i++)
		{
			if(!odd%2==0)
			{
				System.out.print(i);
				Thread.sleep(1000);
			}
			else{
				break;
			}
		}catch(Excerption e)
		{
			e.printStackTrace();
		}
	}
}

class ThreadExtend2 extends Thread
{
	int even;


	ThreadExtend2(int even)
	{
		this.even=even;
	}
	public void run()
	{
	try{

		for(int i=0;i<=even;i++)
		{
			if(even%2==0)
			{
				System.out.print(i);
				Thread.sleep(2000);
			}
			else{
				break;
			}
		}catch(Excerption e)
		{
			e.printStackTrace();
		}
	}
}

public class Demo4
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter No of term: ");
	int a =	sc.nextInt();

	ThreadExtend1 s1 = new ThreadExtend1(a);
	ThreadExtend2 s2 = new ThreadExtend2(a);

	s1.start();
	s2.start();
}	