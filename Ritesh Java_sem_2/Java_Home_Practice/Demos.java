import java.util.Scanner;

public class Demos
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner (System.in);

		double height ;
		double distance;

		System.out.println("Enter Height: ");
		height = sc.nextInt();

		System.out.println("Enter Distance: ");
		distance = sc.nextInt();

		PythagoreanTheorem p1 = new PythagoreanTheorem(height,distance);

		System.out.print("Angle: "+p1.getAngle());
		System.out.print("Ans: "+p1.getHypotenuse());



	}
}

class PythagoreanTheorem
{
	double height;
	double distance;

	public PythagoreanTheorem(double height , double distance)
	{
		this.height = height ;
		this.distance = distance;
	}

	public double getAngle()
	{
		return Math.atan(height/distance);	
	}

	public double getHypotenuse()
	{
		return Math.sqrt(height*height + distance*distance);
	}
}
