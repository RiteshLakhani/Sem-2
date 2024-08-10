class Student{
	int rollNo;
	String name;

	public Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	void printStudentDetails()
	{
		System.out.println(rollNo+"/--/"+name);
	}
}

public class Array_Obj{
	public static void main(String[]args)
	{
		Student s1[] = new Student[3];

		s1[0]= new Student(101,"Ritesh");
		s1[1]= new Student(102,"Het");
		s1[2]= new Student(103,"Shubham");

		s1[0].printStudentDetails();
		s1[1].printStudentDetails();
		s1[2].printStudentDetails();

	}
}