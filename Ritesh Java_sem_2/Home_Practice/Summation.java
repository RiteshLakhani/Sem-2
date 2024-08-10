import java.util.Scanner;

public class Pra_5_itr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int a = sc.nextInt();

		int sum = calSum(a);
		System.out.println("Ans: "+sum);
	}

	public static int calSum(int a)
	{

		int sum = 0;

		while(a!=0)
		{
			int b = a%10;
			sum = sum + b;
			a = a/10;
		}

		return sum;	
	}	
}
	
