class Student
{
	int rollNo;
	String name;

	public Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	void printDetails()
	{
		System.out.println("/ "+rollNo+"/--"+name+"/");
	}
}

public class ArrayOfObject
{
	public static void main(String[] args) {
		
		Student [] stu = new Student[3];

		stu[0] = new Student(101,"darshan");
		stu[1] = new Student(102,"Ritesh");
		stu[2] = new Student(103,"Het");

		stu[0].printDetails();
		stu[1].printDetails();
		stu[2].printDetails();
	}
}