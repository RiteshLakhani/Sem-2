import java.util.Scanner;

public class ArrayDemo2
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Array: ");
		int a = sc. nextInt();

		int n[] = new int[a];

		for(int i=0;i<n.length ;i++)
		{
			System.out.println("Enter Number: ");
			n[i] = sc.nextInt();	
		}

		for(int i=0;i<n.length;i++)
		{
			System.out.println("n[" + i + "]=" + n[i]);
		}

		for(int i=0;i<n.length-1 ;i++)
		{
			for(int j=0;j<n.length-i-1 ; j++)
			{
				if(n[j]>n[j+1])
				{
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}

		for(int i=0 ; i<n.length ; i++)
		{
			System.out.println("Sorted n[" + i + "]=" + n[i]);
		}

		System.out.println("Enter No to Search: ");
		int noToSearch = sc . nextInt();

		int low = 0;
		int high = n.length-1;
		boolean isFound = false; 


		while(high>=low)
		{
			int mid = (high+low)/2;

			if(noToSearch < n[mid])
			{
				high = mid -1 ;
			}
			else if(noToSearch == n[mid])
			{
				System.out.println("Found at = "+mid);
				isFound = true;
				break;
			}
			else
			{
				low = mid + 1 ;
			}

			if(!isFound)
			{
				System.out.println("Number Does not exists in Arrays");
			}
		}

	}
}