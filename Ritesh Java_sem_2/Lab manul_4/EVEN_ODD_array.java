import java.util.Scanner;

public class EVEN_ODD_array
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of N: ");
		int n = sc.nextInt();

		int Sum;

		int a[]= new int[n];

		for(int i=0;i<=a.length;i++)
		{
			if( int a%2==0)
			{
				int even=even+1;
			}
			else
			{
				int odd=odd+1;
			}
		}
		System.out.println("Sum="+even);
		System.out.println("Sum="+odd);



	}
}