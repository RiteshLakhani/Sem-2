public class Pra_1 extends A {
	
	public void methodB()
	{
		System.out.println("CHILD CLASS");
	}
	public static void main (String[]args)
	{
		Pra_1 obj = new Pra_1();
		obj.methodA();
		obj.methodB();
	}

}

class A
{
	public void methodA()
	{
		System.out.println("BASE CLASS");
	}
}