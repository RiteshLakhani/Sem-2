public class MyDemo
{
	public static void main(String[] args)
	{
		try
		{
			print();
			System.out.print("first caught ");
		}	
		catch(Exception e)
		{
			System.out.println("main Caught()");
		}
	}

	public static void print() throws Exception
	{
		int a=10;

		//if(a<5)
		//{
		//	throw new Exception("Just my extends");
		//}
		if(a<5)
		{
			throw new Exception("Just my extends");
		}
	}
}