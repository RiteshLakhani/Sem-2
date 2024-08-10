import java.util.Scanner;

public class Pra_4_Recu
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int a = sc.nextInt();

		int ans = 0;

		ans = factorail(a);
		System.out.println("Ans = "+ans);	
	}

	public static int factorail(int a)
	{
		if(a<=0)
		{
			return 1;
		}
		else{
			return a*factorail(a-1);
		}
	}
}