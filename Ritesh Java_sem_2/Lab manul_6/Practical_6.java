// wap to find area and perimeter of circle using methods.

import java.util.Scanner;

public class Practical_6
{
	public static void main(String[]args)
	{
		 float area , perimeter;

        circle c1 = new circle();

        area = c1.getArea();
        System.out.println("Area of Circle : "+area);
        System.out.println();
        perimeter = c1.getPerimeter();
        System.out.println("Perimeter of Circle : "+perimeter);
	}
}

class circle
{
	Scanner sc = new Scanner(System.in);

	int radius;
	double ans;

	float getArea()
	{
		System.out.println("TO Find Area : ");
        System.out.println("--------------------------");
        System.out.println("Enter the Radius : ");
        radius=sc.nextInt();

        ans = (Math.PI*(radius*radius));

        return (float)ans;
	}

	float getPerimeter()
	{
		System.out.println("TO Find Perimeter : ");
        System.out.println("--------------------------");
        System.out.println("Enter the Radius : ");
        radius=sc.nextInt();

        ans = 2*Math.PI*radius;
        
        return (float)ans;
	}
}