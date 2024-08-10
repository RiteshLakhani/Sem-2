import java.util.Scanner;
public class Pra_7{
	public static void main ( String [] args )
	{
		Scanner sc = new Scanner ( System.in );

		System.out.println("Enter Name : ");
		String s = new String();
		s = sc.nextLine();
		System.out.println(s);

		String reversedString = " ";

		for(int i = s.length() - 1 ; i>=0 ; i--)
		{
			reversedString += s.charAt(i);
		}

		System.out.println(reversedString);

		if(s.equals(reversedString))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.pritln("Not Palindrome");
		}
	}
}