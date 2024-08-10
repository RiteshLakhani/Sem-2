import java.util.Scanner;
class Marks
{
	int c;
	int ds;
	int total;

	Marks()
	{
		//Scanner sc = new Scanner(System.in);

		//System.out.println("Enter C Marks: ");
		//c = sc.nextInt();

		//System.out.println("Enter DS Marks: ");
		//ds = sc.nextInt();
		c = 50;
		ds = 60;
	}

	void add()
	{
		total=c+ds;
	}

	void putData()
	{
		System.out.println("C Marks:"+c);
		System.out.println("DS Marks:"+ds);
		System.out.println("Total Marks:"+total);
	}

}

class Student_2{
	public static void main(String[] args)
	{
		Marks m1=new Marks();

		//m1.Ritesh()
		m1.add();
		m1.putData();

	}
}