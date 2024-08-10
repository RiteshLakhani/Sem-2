import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter A: ");
			int a = sc.nextInt();

			System.out.println("Enter B: ");
			int b = sc.nextInt();

			System.out.println("Ans: "+a/b);
		}
		catch(ArithmeticException ae)
		{
			//e.printStackTrace();
			System.out.println("Kem cho?");
		}
	}
}