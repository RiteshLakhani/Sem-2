class Mark
{ 
	int c;
	int java;
	int total;
}
class Personal
{
	int con;
}
class Student
{
	public static void main(String[]args)
		{
			Mark m1= new Mark();
			Personal p1= new Personal();

			m1.c=90;
			m1.java=92;

			p1.con=1234;

			System.out.println("C Mark="+m1.c);
			System.out.println("Java Mark="+m1.java);
			System.out.println("contact no="+p1.con);

		}
}