public class Demo5
{
	public static void main(String[] args) {
		

		DH d1 = new DH();
	}
}

class p 
{
	public p()
	{
		System.out.println("Program");
	}

	public p(int i , int j)
	{
		System.out.println("Program + + ");
	}

}

class DH extends p
{
	public DH()
	{
		super();
		System.out.println("DH");
	}

	public DH(int i,int j)
	{
		
		System.out.println("DH ++");
	}
}