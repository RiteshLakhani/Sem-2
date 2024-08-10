import java.util.Scanner;

public class Pra_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int a = sc.nextInt();

		int b[] = new int[a];

		System.out.println("Enter the element of Array: ");

		for(int i=0 ; i<a ; i++)
		{
			b[i] = sc.nextInt();
		}

		int sum = 0 ;

		for(int i=0 ; i<a ; i++)
		{
			if(b[i]%2==0)
			{
				sum = sum + b[i];
			}
		}

		System.out.println("Sum of Even Number: "+sum);
	}
}
	
