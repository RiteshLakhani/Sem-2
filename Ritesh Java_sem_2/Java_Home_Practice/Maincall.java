import java.util.Scanner;

public class Maincall
{
	public static void main(String[] args) {
		int balance = 5000;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Withdraw Amount: ");
		int withdraw = sc.nextInt();

		try
		{
			if(balance - withdraw <1000)
			{
					throw new Exception ("Balance < 1000 error");
			}
			else
			{
				balance = balance - withdraw ;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

			finally
			{
				sc.close();
			}
	}
}