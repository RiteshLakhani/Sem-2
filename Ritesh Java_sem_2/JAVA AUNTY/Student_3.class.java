import java.util.Scanner;
class Marks
{
	int c;
	int ds;
	int total;

	Marks(int c1 , int ds1 )
	{
		//Scanner sc = new Scanner(System.in);

		//System.out.println("Enter C Marks: ");
		//c = sc.nextInt();

		//System.out.println("Enter DS Marks: ");
		//ds = sc.nextInt();
		c = c1;
		ds = ds1;
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

class Student_3{
	public static void main(String[] args)
	{
		Marks m1=new Marks(50,60);

		//m1.Ritesh()
		m1.add();
		m1.putData();

	}
}