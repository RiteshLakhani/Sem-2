import java.util.Scanner;

public class Pra_14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Hour: ");	
		int h = sc.nextInt();

		System.out.print("Enter Minute: ");	
		int m = sc.nextInt();

		double angle = calAngle(h,m);
		System.out.println("Angle= "+angle);
	}

	public static double calAngle(int h , int m)
	{
		double hAngle = (h*30) + (m*0.5);
		double mAngle = m*6;
		double angle = Math.abs(hAngle - mAngle);

		return Math.min(angle , 360 - angle);
	}
}