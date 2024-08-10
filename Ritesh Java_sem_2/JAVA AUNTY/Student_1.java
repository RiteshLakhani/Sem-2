import java.util.Scanner;
class Marks
{
	int c;
	int ds;

	void Ritesh()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter C Marks: ");
		c = sc.nextInt();

		System.out.println("Enter DS Marks: ");
		ds = sc.nextInt();
		//c = 50;
		//ds = 60;
	}

	void putData()
	{
		System.out.println("C Marks:"+c);
		System.out.println("DS Marks:"+ds);

	}

}

class Student_1{
	public static void main(String[] args)
	{
		Marks m1=new Marks();

		m1.Ritesh();
		m1.putData();
	}
}