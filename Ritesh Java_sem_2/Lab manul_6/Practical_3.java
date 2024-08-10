import java.util.Scanner;

public class Practical_3
{
	public static void main(String[]args)
	{
		Bank_Account b1 = new Bank_Account();
		b1.getAccountdetails();
		b1.displayAccountDetails();
	}
}

class Bank_Account
{
	long accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;

	public void getAccountdetails()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Please Enter AccountNo : ");
        accountNo = sc.nextLong();
        System.out.print("Please Enter User Name : ");
        userName = sc.next();
        System.out.print("Please Enter Email : ");
        email = sc.next();
        System.out.print("Please Enter Account Type : ");
        accountType = sc.next();
        System.out.print("Please Enter Account Balance : ");
        accountBalance = sc.nextInt();
	}

	public void displayAccountDetails()
	{
		System.out.println("AccountNo:"+accountNo);
		System.out.println("User Name:"+userName);
		System.out.println("Email:"+email);
		System.out.println("Account Type:"+accountType);
		System.out.println("Account Balance:"+accountBalance);
	}

}
