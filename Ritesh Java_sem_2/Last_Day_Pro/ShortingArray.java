import java.util.Scanner;

public class ShortingArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Array: ");
		int a = sc .nextInt();

		int n [] = new int [a];

		for(int i=0 ; i<n.length ; i++)
		{
			System.out.println("Enter Number: ");
			n[i] = sc.nextInt();
		}

		for(int i=0 ; i<n.length ; i++)
		{
			//System.out.println("n[" + i + "]="+n[i]);
			//System.out.println("n[" + i + "]=" + n[i]);
			System.out.println("Array[" + i + "]=" + n[i]);
		}

		for(int i=0 ; i<n.length-1 ; i++)
		{
			for(int j=0 ; j<n.length-i-1;j++)
			{
				if(n[j]>n[j+1])
				{
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}

		System.out.println("--------Sorted Array----");

		for(int i=0;i<n.length;i++)
		{
			System.out.println("Array["+i+"]="+n[i]);
		}	
	}
}