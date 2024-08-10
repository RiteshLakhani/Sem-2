package studyopedia;

public class lab_8 extends A {
	
	public void methodB()
	{
		System.out.println("CHILD CLASS");
	}
	public static void main (String[]args)
	{
		lab_8 obj = new lab_8();
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
