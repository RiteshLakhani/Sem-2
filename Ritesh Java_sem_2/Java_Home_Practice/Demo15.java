abstract class Vegetable
{
	private String color ;

	public Vegetable(String color)
	{
		this.color=color;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	@Override
	public String toString()
	{
		return "Vegetable:"+color;
	}
}

class Potato extends Vegetable
{
	public Potato(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Potato:"+getColor();
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
		return "Tomato:"+getColor();
	}
}
class Brinjal extends Vegetable
{
	public Brinjal(String color)
	{
		super(color);
	}

	public String toString()
	{
		return "Brinjal:"+getColor();
	}
}

public class Demo15
{
	public static void main(String[] args) 
	{
		Potato p1 = new Potato("Brown");
		System.out.println(p1);

		Tomato t1 = new Tomato("Red");
		System.out.println(t1);

		Brinjal b1 = new Brinjal("Purple");
		System.out.println(b1);

	}
}