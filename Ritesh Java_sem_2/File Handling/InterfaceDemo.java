interface EventListener
{
	public void perfromEvent();
}

interface MouseListner extends EventListener
{
	public void mousedClicked();
	public void mousePressed();
	public void mouseMoved();
}

interface KeyListner extends EventListener
{
	public void keyPressed();
	public void keyRealased();
}

class EventDemo implements MouseListner,KeyListner
{
	public void mousedClicked()
	{
		System.out.println("Clicked");
	}

	public void mousePressed()
	{
		System.out.println("Pressed");
	}

	public void mouseMoved()
	{
		System.out.println("Moved");
	}

	public void keyPressed()
	{
		System.out.println("Key Pressed");
	}

	public void keyRealased()
	{
		System.out.println("Key Realsed");
	}

	public void perfromEvent()
	{
		System.out.println("Event Perfromed");
	}
}

public class InterfaceDemo{
	public static void main(String[] args) 
	{
		EventDemo e1 = new EventDemo();

		e1.mousedClicked();
		e1.mousePressed();
		e1.mousePressed();

		e1.keyPressed();
		e1.keyRealased();

		e1.perfromEvent();	
	}
}

