import java.util.Scanner;
public class ThrowsDemo
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n1: ");
		int n = sc.nextInt();
		

		try
		{
			printA(a[n]);
		}
		catch(ArrayIndexOutOfBoundsException AIOBe){
			System.out.println("Please insert valid Index");
		}
	}

	static void printA(int n) throws ArrayIndexOutOfBoundsException{
	System.out.println(n);	
}

