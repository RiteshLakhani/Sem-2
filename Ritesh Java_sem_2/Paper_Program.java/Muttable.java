class Demo
{
	int a;

	int add()
	{
		return (a + 5);
	}
}

public class Muttable
{
	public static void main(String[] args) {
		
		Demo d1 = new Demo();

		d1.a=10;

		int ans = d1.add();

		System.out.println(d1.a);
		System.out.println(""+ans);
	}
}