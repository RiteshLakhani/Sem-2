import java.util.Scanner;

public class SUM_OF_ARRAY{
	private static Scanner sc;
	public static void main(String [] args)
	{
		sc= new Scanner(System.in);

		int n,i,sum=0;

		System.out.print(" Please Enter Number of elements in an array : ");
		n = sc.nextInt();

		int  a [] = new int[n];

		System.out.print(" Please Enter " + n + " elements of an Array  : ");
		for (i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.print("Array Element");
		for (i = 0; i < n; i++)
		{
			//System.out.println(a[i]+" ");
			if(a[i]%3==0 && a[i]%5==0)
			{
				sum=sum+a[i];
			}
			else
			{
				System.out.println("Invaild");
			}
		}   

		System.out.println("\n Addition of Array an element= " +sum);
	}	
}









