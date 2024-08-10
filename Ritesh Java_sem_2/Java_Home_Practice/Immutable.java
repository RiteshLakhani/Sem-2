class ImmutableDemo
{
	int a ;

	int add5()
	{
		return ( a + 5 );
	}
}

public class Immutable{
	public static void main(String[]args)
	{
		ImmutableDemo m1 = new ImmutableDemo();

		m1.a=10;
		int ans = m1.add5();

		System.out.println("A is = "+m1.a);
		System.out.println("A return value: "+ans);
	}
}