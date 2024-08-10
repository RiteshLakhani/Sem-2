import java.util.Scanner;

public class array{
	public static void main(String[] args){

		int a[],n;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter array no: ");
		n=s.nextInt();

		a=new int[n];

		for ( int i=0;i<a.length;i++)
		{
			System.out.println("Enter Array: ");
			a[i]=s.nextInt ();
		}

		for ( int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]+"");
		}
	}
}