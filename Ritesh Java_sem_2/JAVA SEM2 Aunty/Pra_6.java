import java.util.Scanner;
public class Pra_6{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner ( System.in );
		System.out.println("Enter Name: ");
		String a = sc.next();

		String b = a.replace('l','*');
		System.out.println(b);

		String c = a.toUpperCase();
		System.out.print(c);	

		String d = a.toLowerCase();
		System.out.println(d);		

	}
}