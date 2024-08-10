import java.util.Scanner;
public class Pra_3{
	public static void main ( String [] args )
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String a = sc.next();

		int len=a.length();

		
		//Find index of charcter From String.

		String ch;

		System.out.println("Enter Character:");
		ch = sc.next();

		for(int i=0 ; i<len-1 ; i++)
		{
			//if(a[i]==ch)
			//{
				System.out.println(a.indexOf(i));
			//}
		}

		//System.out.println(a.indexOf('R'));


	}
}