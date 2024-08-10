import java.util.Scanner;

public class Practical_1
{
	public static void main(String[]args)
	{
		System.out.println("");

		student s1 = new student();
		s1.show();

		System.out.println("---------------------------------");
		student s2 = new student(22010101099l,"Ritesh","Male",90);
		s2.show();

		System.out.println("---------------------------------");
		student s3 = new student("Ritesh","Male",90);
		s3.show();
	}
}

class student
{
	long enrollment_No;
	String name;
	String gender;
	int marks;
	static int count;

	student()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Enrollment_No:");
		long enrollment_No = sc.nextLong();

		System.out.println("Enter Name:");
		String name = sc.next();
		//sc.nextline();

		System.out.println("Enter Gender:");
		String gender = sc.next();

		System.out.println("Enter Marks:");
		int marks = sc.nextInt();

		//count++;
	}

	student(long e, String n, String g, int m)
	{
		enrollment_No=e;
		name =n;
		gender =g;
		marks =m;
		count++;
	}

	student( String name, String gender, int marks)
	{
		this.name=name;
		this.gender=gender;
		this.marks=marks;
		count++;
	}

	public void show()
	{
		System.out.println(enrollment_No + "\n" +name+ "\n" +gender+ "\n" +marks+ "\n" +count+ "\n");
	}
}