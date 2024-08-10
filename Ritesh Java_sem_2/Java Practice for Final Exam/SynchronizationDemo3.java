class Table 
{
	synchronized void printTable(int n)
	{
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(n*i+" ");

			try{
				Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread
{
	Table t;

	MyThread1(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		synchronized (t){
		t.printTable(2);
		}
	}
}

class MyThread2 extends Thread
{
	Table t;

	MyThread2(Table t)
	{
		this.t = t ;
	}

	public void run()
	{
		synchronized(t){
		t.printTable(4);
		}
	}
}
public class SynchronizationDemo3
{
	public static void main(String[] args) {
		
		Table t1 = new Table();

		MyThread1 m1 = new MyThread1(t1);
		MyThread2 m2 = new MyThread2(t1);

		m1.start();
		m2.start(); 
	}
}