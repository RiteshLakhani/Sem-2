import java.util.Scanner;

public class Demo2
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		boolean isPrime = false;

		System.out.println("Enter Number to check: ");
		int a = sc.nextInt();

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				isPrime = true ;
				break;
			}
		}

		if(!isPrime)
		{
			System.out.println(a+" Prime Number");
		}
		else
		{
			System.out.println(a+"Not prime Number");
		}
	}
}