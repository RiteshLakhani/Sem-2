import java.util.Scanner;

public class Max_2{
	private  static Scanner sc;

	public static void main(String[] args)
	{
		int a,b;

		sc= new Scanner(System.in);

		System.out.println("Enter A: ");
		a=sc.nextInt();

		System.out.println("Enter B: ");
		b=sc.nextInt();

		calMax2(a,b);
	}

	public static void calMax2(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a+ " is Max");
		}
		else
		{
			System.out.println(b+ " is Max");	
		}
	}
}
