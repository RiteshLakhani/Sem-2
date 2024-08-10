import java.util.Scanner;

public class Simple_intrest
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		double p,r,t,a;

		sc = new Scanner(System.in);

		System.out.println("Enter Principal: ");
		p = sc.nextDouble();

		System.out.println("Enter Rate of Intrest: ");
		r = sc.nextDouble();

		System.out.println("Enter Time Period: ");
		t = sc.nextDouble();

		a = calSimpleIntrest(p,r,t);

		System.out.println("The Simple Interest for Principal Amount " + p + " is = " + a);

	}

	public static  double calSimpleIntrest( double p, double r, double t)
	{
		double SimpleIntrest;

		SimpleIntrest=(p*r*t)/100;

		return SimpleIntrest;

		//System.out.println("The Simple Interest for Principal Amount " + p + " is = " + SimpleIntrest);
	}
}