import java.util.Scanner;

public class Fact
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to check: ");
		int a = sc.nextInt();

		int result = fact(a);

		System.out.println("Ans: "+result);	
	}

	public static int fact(int a)
	{
		if(a==0 || a==1)
		{
			return 1;
		}
		else{
			return a*fact(a-1);
		}
	}
}