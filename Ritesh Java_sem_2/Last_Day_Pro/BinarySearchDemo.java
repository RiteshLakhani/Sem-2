import java.util.Scanner;

public class BinarySearchDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Number Of Array will be Stored: ");
		int a = sc.nextInt();

		int n[] = new int[a];

		for(int i=0 ; i<n.length ; i++)
		{
			System.out.println("Enter Number to stored In Array: ");
			n[i] = sc.nextInt();
		}

		System.out.println("-----Normal Array-----");

		for(int i=0 ;i<n.length;i++)
		{
			System.out.println("Array["+i+"]="+n[i]);
		}

		System.out.println("----Sorted Array-----");

		for(int i=0 ; i<n.length-1 ; i++)
		{
			for(int j=0 ; j<n.length-i-1 ; j++)
			{
				if(n[j]>n[j+1])
				{
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}

		for(int i=0;i<n.length;i++)
		{
			System.out.println("Array["+i+"]="+n[i]);
		}

		System.out.println("---For Binary Search----");

		System.out.println("Enter Number to Search: ");
		int s = sc.nextInt();

		int low = 0 ;
		int high = n.length-1;
		boolean isFound = false;

		while(high>=low)
		{
			int mid = (high + low ) / 2 ;

			if(s<n[mid])
			{
				high = mid -1 ;
			}
			else if(s==n[mid])
			{
				System.out.println("Found at ="+mid);
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
			System.out.println("Number Does not exists in Array.......");
		}
			
	}
}