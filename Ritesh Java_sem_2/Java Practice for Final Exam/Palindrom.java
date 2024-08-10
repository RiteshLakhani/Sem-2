import java.util.Scanner;

public class Palindrom
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String s = sc.nextLine();

		String b = "";

		for(int i=s.length()-1 ; i>=0 ; i--)
		{
			b = b + s.charAt(i);
		}

		System.out.println(b);

		if(s.equals(b))
		{
			System.out.println("String is Palindrom");
		}
		else{
			System.out.println("String is not Palindrom");
		}
	}
}