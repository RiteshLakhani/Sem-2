public class Box_Demo{
	public static void main(String[]args)
	{
		BOX r1 = new BOX(10,20,5);
		BOX r2 = new BOX(3,6,9);

		r1.volume();
		r2.volume();
	}
}

class BOX{
	double lenght;
	double breadth;
	double height;

	BOX(double lenght,double breadth,double height)
	{
		this.lenght = lenght;
		this.breadth = breadth;
		this.height = height;
	}

	void volume()
	{
		double volume = lenght * breadth * height ; 
		System.out.println("Voulme is "+volume);
	}
}