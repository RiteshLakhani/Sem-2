import java.util.Scanner;

public class fibbo{
	private static Scanner sc;

	public static void main(String[] args)
	{
		int n;

		sc = new Scanner(System.in);

		System.out.print("Enter Number of Term: ");
		n = sc.nextInt();

		calfibbo(n);
	}

	public static void calfibbo(int n)
	{
		int num1=0, num2=1;

		int i=0;

		while(i<n)
		{
			System.out.print(num1+ " " );

			int num3= num1 + num2 ;
			num1 = num2 ;
			num2 = num3 ;
			i=i+1;
		}
	}
}