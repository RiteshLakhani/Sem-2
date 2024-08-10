import java.util.Scanner;

public class SwitchDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1");
		System.out.println("Enter 2");
		System.out.println("Enter 3");
		System.out.println("Enter 4");
		System.out.println("Enter 5");
		System.out.println("Enter 6");
		System.out.println("Enter 7");

		System.out.println("Enter Number upto : ");
		int ch = sc.nextInt();

		switch(ch)
		{
			case 1:
				{
					System.out.println("Monday");
					break;
				}
			case 2:
				{
					System.out.println("Tuesday");
					break;
				}
			case 3:
				{
					System.out.println("Wednesday");
					break;
				}
			case 4:
				{
					System.out.println("Thursday");
				}
			case 5:
				{
					System.out.println("Friday");
					break;
				}
			case 6:
				{
					System.out.println("Saturday");
					break;
				}
			case 7:
				{
					System.out.println("Sunday");
					break;	
				}
			default:
				{
					System.out.println("Plz Enter Valid Number!!!!");
				}
			
		}
	}
}