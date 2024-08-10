import java.util.Scanner;

public class Demo13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("A:");
		int a=sc.nextInt();

		System.out.println("B:");
		int b=sc.nextInt();

		System.out.println("C:");
		int c =sc.nextInt();

		int max = a>b?(a>c?System.out.println("A is maximum"):System.out.println("C is maximum")):(b>c?System.out.println("b is maximum"):System.out.println("C is maximum"));
		System.out.println("Max: "+max);



	}
}