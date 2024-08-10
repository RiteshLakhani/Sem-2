import java.util.Scanner;

public class Prime
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner (System.in);

		int n;
	
		System.out.println("Enter No: ");
		n=sc.nextInt();

		check(n);
	}

	public static void check(int n)
	{
		boolean flag = false;

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}

		if(!flag)
		{
			System.out.println("Enter No is prime");
		}
		else
		{
			System.out.print("Enter No is Not prime");
		}
	}
}