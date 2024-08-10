abstract class Vegetable
{
	 String color;

	public Vegetable(String color)
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String toString();
	{
		return "Vegetable: color = "+color;
	}
}

class Potatao extends Vegetable
{
	public Potato(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Potato: "+getColor();
	}
}

class Tomato extends Vegetable
{
	public Tomato(String color)
	{
		super(color);

	}

	public String toString()
	{
		return "Tomato: "+getColor();
	}
}

class Brinjal extends Vegetable
{
	public  Brinjal(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Brijal: "+getColor();
	}
}

public class Demo4
{
	public static void main(String[] args) {
		
		Potato p1 = new Potatao("Brown");
		System.out.println(p1);

		Tomato t1 = new Tomato("Red");
		System.out.println(t1);

		Brinjal b1 = new Brinjal("Purple");
		System.out.println(b1);
	}
}