import java.util.Scanner;

public class Pra_3{
	public static void main(String[]args)
	{
		

		Rectangle r1 = new Rectangle();
		r1.set();
		Rectangle r2 = new Rectangle(5,5);
		Rectangle r3 = new Rectangle();

		System.out.println("Area of R1:"+(r1.area()));
		System.out.println("Area of R2:"+(r2.area()));
		System.out.println("perimeter of R2:"+(r2.perimeter()));

		int forR3 = r3.area();
		System.out.println("Area of R3 = "+forR3);
	}
}

class Rectangle
{
	int length,width;
	static int count;

	Rectangle()
	{
		length=10;
		width=10;
		count++;
	}

	Rectangle(int l , int w )
	{
		length = l ; 
		width = w ;
	}

	Rectangle(Rectangle r)
	{
		this.length = r.length;
		this.width = r.width;
	}

	int area()
	{
		int area = length * width;
		return area;
	}

	int perimeter()
	{
		int per = 2*(length+width);
		return per;
	}

	public void set()
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Length: ");
		 length = sc.nextInt();

		System.out.println("Enter width: ");
		 width = sc.nextInt();
	}


}