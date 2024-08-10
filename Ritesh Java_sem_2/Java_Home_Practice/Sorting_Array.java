import java.util.Scanner;

public class Sorting_Array
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter No of Array: ");
		int a = sc.nextInt();

		int n[] = new int [a];

		for ( int i = 0 ; i < n.length ; i++ )
		{
			System.out.println("Enter Number: ");
			n[i] = sc.nextInt();
		}

		System.out.println("  Delclar of Array ");

		for( int i = 0 ; i < n.length ; i++ )
		{
			System.out.println("Array["+i+"]="+n[i]);
		}
		

		for( int i=0 ; i<n.length - 1 ; i++)
		{
			for ( int j = 0 ; j<n.length-i-1 ; j++)
			{
				//System.out.println("SORTING OF Array");

				if ( n[j] > n[j+1])
				{
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] =temp;
				}	
			}
		}

		System.out.println("SORTED ARRAY");
		for(int i = 0 ; i<n.length ; i++)
		{
			
			System.out.println("Array["+i+"]="+n[i]);
		}
	}
}