import java.util.Scanner;
public class Strnm{
	public static void main ( String [] args )
	{
		String name = new String("Hello Java");
		System.out.println("Name: "+name);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String a = sc.next();
		System.out.println("Name:"+a);

		System.out.println(a.length());
		int len = a.length();
		System.out.println("Length:"+len);

		System.out.println(a.charAt(2));
		char x = a.charAt(2);
		System.out.println("CharAt:"+x);


		System.out.println(a.substring(1,3));



	}
}