import java.util.Scanner;

public class Pra_4_itr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number:");
		int a = sc.nextInt();

		int fact = 1 ;

		for(int i=a;i>=1;i--)
		{
			 fact = fact * i;
		}

		System.out.println("Ans: "+fact);	
	}
}