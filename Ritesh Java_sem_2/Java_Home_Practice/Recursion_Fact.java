import java.util.Scanner;

public class Recursion_Fact{
	public  static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);

		int n , f ;
		System.out.println("Enter Number : ");
		n = sc.nextInt();

		f = fact(n);
		System.out.println("Factorial of Number is = "+f);
	}

	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	
	}
}

	



