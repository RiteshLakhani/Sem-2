import java.util.Scanner;

public class Pra_5_Recu
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int sum = calSum(a);
        System.out.println("Ans: " + sum);
    }

    public static int calSum(int a) 
    {
        if (a==0)
        {
            return 0;
        }

        int lastDigit = a%10;
        int remainingDigits = a/10;
        int sum = lastDigit + calSum(remainingDigits);

        return sum;
    }
}
	