import java.util.Scanner;

public class Max_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("A:");
		int a = sc.nextInt();

		System.out.println("b:");
		int b = sc.nextInt();

		System.out.println("c:");
		int c = sc.nextInt();

		int maxOfThree = a>b ? (a>c?a:c) : (b>c?b:c);
		System.out.println("Maximum is "+maxOfThree);

		int minOfThree = a<b? (a<c?a:c) : (b<c?b:c);
		System.out.println("Minimum is "+minOfThree);

	}
}