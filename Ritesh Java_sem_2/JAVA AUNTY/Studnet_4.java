import java.util.Scanner;
class STUDENT
{
	int enrollmentno;
	String name;
	String gender;
	int marks;

	STUDENT(int en1, String name1, String gender1, int marks1)
	{
		enrollmentno=en1;
		name=name1;
		gender=gender1;
		marks=marks1;
	}

	void putData()
	{
		System.out.println("EnrollmentNo:"+enrollmentno);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Marks:"+marks);
	}
}

class Studnet_4
{
	public static void main(String[]args)
	{
		int a,d;
		String b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter EnrollmentNo: ");
		a = sc.nextInt();

		System.out.println("Enter Name: ");
		b = sc.next();

		System.out.println("Enter EnrollmentNo: ");
		c = sc.next();

		System.out.println("Enter EnrollmentNo: ");
		d = sc.nextInt();

		STUDENT s1 = new STUDENT(a,b,c,d);

		s1.putData();
	}
}