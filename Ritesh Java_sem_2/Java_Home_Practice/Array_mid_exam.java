import java.util.Scanner;

public class Array_mid_exam
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);

		int a[] = new int[5];

		for( int i=0 ; i<a.length-1;i++)
		{
			System.out.println("Enter("+i") Subject of mark: ");
			int n[i] = sc.nextInt();
		}

		for(int i=0 ; i<a.length-1;i++)
		{
			System.out.print(i+"Subject mark: "+n[i]);
		}
	}
}