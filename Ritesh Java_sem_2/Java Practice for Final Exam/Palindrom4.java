import java.util.Scanner;

public class Palindrom4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String a = sc.nextLine();

		String b ="";

		for(int i=a.length()-1;i>=0;i--)
		{
			b = b + a.charAt(i);
		}

		if(a.equals(b))
		{
			System.out.println("String is Palindrom");
		}
		else{
			System.out.println("String is not Palindrom");
		}
	}
}