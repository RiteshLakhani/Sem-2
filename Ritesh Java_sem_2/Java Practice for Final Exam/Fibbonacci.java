import java.util.Scanner;

public class Pra_7_Recu
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Terms: ");
		int a = sc.nextInt();

		for(int i=0 ; i<a ; i++)
		{
			System.out.print(fibb(i)+" ");
		}

	}

	public static int fibb(int a)
	{
		if(a<=1)
		{
			return a;
		}
		else{
			return fibb(a-1)+fibb(a-2);
		}
	}


}