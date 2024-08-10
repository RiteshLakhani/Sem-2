class MainCall
{
	static int currentBal = 5000;

	public static void main(String[] args) 
	{	
		try
		{
			int a = Integer.parseInt(args[0]);
			withdraw(a);
		}	
		catch(Exception e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}

	public static void withdraw(int a) throws Exception
	{
		int newB = currentBal - a ;

		if(newB<1000)
		{
			throw new MyException("Ritesh Excption");
		} 
	}
}

class MyException extends Exception
{
	public MyException(String s){
		super(s);
	}
}