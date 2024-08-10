import java.util.Scanner;
public class Pra_4{
	public static void main ( String [] args )
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String a = sc.next();
		
		System.out.println("Enter Surname: ");
		String b = sc.next();

		//boolean c = a.equals(b);
		//System.out.println(c);


		//boolean d = a.equalsIgnoreCase(b);
		//System.out.print(d);

		int diff = a.compareTo(b);
		System.out.println(diff);

	}
}
