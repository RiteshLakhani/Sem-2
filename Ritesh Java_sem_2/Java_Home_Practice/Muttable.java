class MuttableDemo
{
	int a ;

	void add5()
	{
		a = a + 10 ;
	}
}

public class Muttable 
{
	public static void main(String [] args)
	{
		MuttableDemo m1 = new MuttableDemo();

		m1.a = 10;
		m1.add5();

		System.out.println("A="+m1.a);
		//System.out.println("A new="+ans);
	}
}