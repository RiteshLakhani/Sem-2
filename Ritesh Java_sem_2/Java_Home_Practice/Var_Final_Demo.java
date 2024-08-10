public class Var_Final_Demo
{
	final int speedLimit = 90 ;

	void run()
	{
		//speedLimit = 400;
		System.out.println("Speed is "+speedLimit);
	}
	public static void main(String[]args)
	{
		
		Var_Final_Demo obj = new Var_Final_Demo();
		obj.run();
		
	}
}