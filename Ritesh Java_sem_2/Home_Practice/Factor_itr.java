import java.util.Scanner;
	
public class Pra_3_itr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to find Factor: ");
		int a = sc.nextInt();

		for(int i = 1 ; i<=a ; i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}		
	}
}