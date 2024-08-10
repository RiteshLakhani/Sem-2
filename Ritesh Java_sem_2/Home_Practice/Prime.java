import java.util.Scanner;

public class Pra_10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to start counting : ");
		int a = sc.nextInt();

		System.out.println("Enter number to end of counting: ");
		int b = sc.nextInt();

 		System.out.println("Prime numbers between " + a + " and " + b + " are:");

 		for(int i=a ; i<=b ; i++)
 		{
 			if(isPrime(i))
 			{
 				System.out.println(i);
 			}
 		}
 	}

 	public static boolean isPrime(int n)
 	{
 		if(n<=1)
 		{
 			return false ;
 		}

 		for(int i=2;i<=Math.sqrt(n);i++)
 		{
 			if(n%i==0)
 			{
 				return false;
 			}
 		}

 		return true;
 	}	
}