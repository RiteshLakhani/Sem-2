import java.util.Scanner;
public class Pra_2{
	public static void main ( String [] args )
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String a = sc.next();
		
		System.out.println("Enter Surname: ");
		String b = sc.next();

		System.out.println(a+b);

		String c = a+b;
		System.out.println(c);


		String d = b.concat(b);
		System.out.println(d);
	

		//Find index of charcter From String.

		for(int i=0 ; i<=a ; i++)
		{
			
		}

		System.out.println(a.indexOf('R'));


	}
}