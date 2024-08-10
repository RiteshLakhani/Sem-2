import java.util.Scanner;

public class Pra_3_Recu
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Factor Number: ");	
		int a = sc.nextInt();

		System.out.println("Factors of " + a + " are:");
        findFactors(a, 1);
	}

	public static void findFactors(int a , int i)
	{
		if(i<=a)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}

			findFactors(a, i + 1);
		}
	}
}