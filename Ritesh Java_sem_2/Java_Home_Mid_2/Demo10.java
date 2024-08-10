abstract class Vegetables
{
	private String color;

	public Vegetables(String color)
	{
		this.color = color;
	}

	public String getcolor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String toString()
	{
		return "Vegetable : color "+color;
	}
}

class Potato extends Vegetables
{
	public Potato(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Potato : color "+getcolor();
	}
}

class Tomato extends Vegetables
{
	public Tomato(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Tomato : color "+getcolor();
	}
}

class Brinjal extends Vegetables
{
 	public Brinjal(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Brinjal : color "+getcolor();
	}
}

public class Demo10
{
	public static void main(String[] args)
	{
		Potato p1 = new Potato("Brown");
		System.out.println(p1.toString());

		Tomato t1 = new Tomato("Red");
		System.out.println(t1.toString());

		Brinjal b1 = new Brinjal("Purple");
		System.out.println(b1.toString());	
	}
}