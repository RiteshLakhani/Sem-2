public class ConstructorInheritanceDemo
{
	public static void main(String[]args)
	{
		DH s1 = new DH(1000,2000);
	}
}

class Programming
{
	public Programming()
	{
		System.out.println("Programming");
	}

	public Programming(int i , int j)
	{
		System.out.println("Programming + +");
	}
}

class DH extends Programming
{
	public DH()
	{
		
		System.out.println("DH");
	}

	public DH(int i , int j )
	{
		super(10,20);
		System.out.println("DH + +");
	}
}
