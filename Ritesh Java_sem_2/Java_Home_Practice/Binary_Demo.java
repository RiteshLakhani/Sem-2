import java.util.Scanner;

public class Binary_Demo{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter How many number Do you want to Add in Array : ");
		int a = sc.nextInt();

		int n[] = new int[a];

		for( int i = 0 ; i < n.length ; i++)
		{
			System.out.println("Enter Number: ");
			 n[i] = sc.nextInt();
		}

		for( int i = 0 ; i < n.length ; i++)
		{
			System.out.println(n[i]);
		}

		//int array[] = {2,3,5,6,8,9,11,18,29,65};
		//int array[]= {65,29,2,3,11,18,6,5,9,8};

		for( int i = 0 ; i< n.length- 1 ; i++)
		{
			for ( int j = 0 ; j < n.length- i - 1 ; j++)
			{
				if ( n[j] > n[j+1])
				{
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp; 
				}
			}
		}

		for( int i = 0 ; i < n.length ; i++)
		{
			System.out.println(n[i]);
		}

		
		System.out.println("Enter Number to Search: ");
		int numberToSearch = sc.nextInt();
		sc.close();

		int low = 0;
		int high = n.length-1;
		boolean isFound = false ; 

		while(high>=low)
		{
			int mid = ( high + low ) / 2 ;

			if( numberToSearch < n[mid] )
			{
				high = mid -1 ;
			}

			else if ( numberToSearch == n[mid])
			{
				System.out.println("Found at "+mid);
				isFound = true;
				break;
			}

			else
			{
				low = mid + 1 ;
			}
		}

		if(!isFound)
		{
			System.out.println("Number does not exists in array");
		}
	}
}