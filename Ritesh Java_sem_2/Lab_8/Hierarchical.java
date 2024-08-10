public class Hierarchical
{
		public static void main(String[]args)
		{
			PermanentEmp p = new PermanentEmp();
			TemporaryEmp t = new TemporaryEmp();
			
			p.dispSalary();
			p.incrementSalary();
			t.dispSalary();
			t.incrementSalary();
		}
}

class Employee
{
	float salary = 4000 ;
	void dispSalary()
	{
		System.out.println("The employee Salary is "+salary);
	}
}

class PermanentEmp extends Employee
{
	double extra = 0.5 ;
	void incrementSalary()
	{
		System.out.println("The Permanent Employee incremented salary is :" +(salary+(salary * extra)));
	}
}

class TemporaryEmp extends Employee
{
	double extra = 0.35;
	
	void incrementSalary()
	{
		System.out.println("The Temporary Employee incremented salary is :" +(salary+(salary * extra)));
	}
}