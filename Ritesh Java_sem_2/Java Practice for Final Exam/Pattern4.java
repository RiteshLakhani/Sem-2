import java.util.Scanner;

public class Pattern4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int tem = 1 ;

		System.out.println("Enter No of Rows: ");
		int a = sc.nextInt();

		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print(" "+tem);
				tem++;
			}
			System.out.println(" ");
		}	
	}
}