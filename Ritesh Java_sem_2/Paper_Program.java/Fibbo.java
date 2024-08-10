import java.util.Scanner;

public class Fibbo
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Terms: ");
		int n = sc.nextInt();

		System.out.println("Series up to: ");

		for(int i=0 ; i<n ; i++)
		{
			System.out.print(fibbo(i)+" ");
		}
	}

	public static int fibbo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibbo(n-1) + fibbo(n-2);
		}
	}
}


