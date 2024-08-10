class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.print(n*i+" ");

			try
			{			
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Demo extends Thread
{
	Table t;

	Demo(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(5);
	}
}

class Demos extends Thread
{
	Table t ; 

	Demos(Table t)
	{
		this.t = t ;
	}

	public void run()
	{
		t.printTable(10);
	}	
}

public class SynchronizationDemo4
{
	public static void main(String[] args) {
	
		Table t = new Table();

		Demo d1 = new Demo(t);
		Demos d2 = new Demos(t);

		d1.start();
		d2.start();		
	}
}