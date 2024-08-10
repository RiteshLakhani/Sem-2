import java.util.Scanner;

public class PalindromeDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String a1 = sc.nextLine();
		String a = "";
		String b="";
		int c;
		for(int i=0;i<a1.length;i++){
			int ascii = (int)a1.charAt(i);
			if(ascii < 97){
				a += (char)ascii;
			}
			else{
				ascii = ascii-32;
				a += (char)ascii;
			}
		}
		for(int i=a1.length()-1;i>=0;i--){
			b=b+a1.charAt(i);
		}
		System.out.println(b);

		for(int i=0;i<a.length();i++)
		{
			if(a1.charAt(i)==b.charAt(i)){
				 c=1;
			}
			else{
				c=0;
			}
		}

		if(c==1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}