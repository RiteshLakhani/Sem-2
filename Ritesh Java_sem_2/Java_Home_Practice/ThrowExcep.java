class ThrowExcep
{
	public static void main(String[] args)
	{
		try
		{
			fun();
		}
		catch(NullPointerException Ne)
		{
			System.out.println("Caught in main");
		}
	}

	static void fun()
	{
		try
		{
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException Ne)
		{
			System.out.println("Caught inside Fun()");
			throw Ne;
		}
	}
}