import java.util.Scanner;

public class Linear_Demo{
	public static void main(String[]args)
	{
		int myArray[] = {5,3,6,8,4,6,2,8,9,11};

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Number to Search: ");
		int numberToSearch = sc.nextInt();

		sc.close();

		boolean flag = false ; 

		for ( int i=0 ; i < myArray.length ; i++)
		{
			if(myArray[i]==numberToSearch)
			{
				System.out.println("Number Found at " +i);
				flag = true ;
				break;
			}
		}

		if(!flag)
		{
			System.out.println("Number Not Exists in myArray");
		}
	}
}