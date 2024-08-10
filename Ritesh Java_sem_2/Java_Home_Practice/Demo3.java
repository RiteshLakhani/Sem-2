import java.util.Date;

class Demo1 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Hello world");

			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}
}

class Demo2 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println(new Date());

			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}
}

public class  Demo3
{
	public static void main(String[] args) {
		
			Demo1 t1 = new Demo1();
			t1.start();
			Demo2 t2 = new Demo2();
			t2.start();

			while(true){
				System.out.println("Ritesh");
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}	
			
			/*try{
				t1.join();
				t2.join();
			}catch (Exception e){
				e.printStackTrace();
			}*/

			
	}
}
