import java.util.*;

public class Factorial
{
	public static void main(String args[])
	{

		int fact=1;
		//int i=1;

		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter A:");
		int a=s.nextInt();


		for(int i=a;i>=1;i--)
		{

			fact=fact*i;

		}
		System.out.println(fact+" is Factorail");
	}
}