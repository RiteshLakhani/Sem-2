class Student
{
	int rollno;
	String name;
	static String college = "abc";

	static void change()
	{
		college="DIECT";
	}

	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

}

class Sta_tic_Demo{
	public static void main(String[]args)
	{
		Student.change();

		Student s1 = new Student (528,"Ritesh");
		Student s2 = new Student (522,"Het");

		s1.display();
		s2.display();
	}
}