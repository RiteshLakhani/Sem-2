import java.util.Scanner;

public class Array_mid_exam
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);

		int a[] = new int[5];

		for( int i=0 ; i<5;i++)
		{
			System.out.println("Enter Subject of mark: ");
			int a[i] = sc.nextInt();
		}

		for(int i=0 ; i<5;i++)
		{
			System.out.print(i+"Subject mark: "+a[i]);
		}
	}
}