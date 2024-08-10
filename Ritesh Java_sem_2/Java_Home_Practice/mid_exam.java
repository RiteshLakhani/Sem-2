import java.util.Scanner;

class PythagoreanTheorem
{
	int height;
	int distance;

	public void getAngle(int h , int d)
	{
		height = h ;
		distance = d ; 

		int ang = Math.toDegrees(Math.atan(h/d));

		System.out.println("Angle: "+ang);
	}

	public void getHypotenuse(int h , int d)
	{
		height = h ;
		distance = d;

		double hp = Math.Sqrt(Math.Pow(h,2) + Math.Pow(d,2)) ;

		System.out.println("Hypotenuse: "+hp); 
	}
}

public class mid_exam
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Height: ");
		int height = sc.nextInt();

		System.out.println("Enter Distance: ");
		int distance = sc.nextInt();

		PythagoreanTheorem p1 = new PythagoreanTheorem();

		p1.getAngle(h,d);

	 	 p1.getHypotenuse(h,d);
	 	
	}
}