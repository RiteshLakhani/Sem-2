interface EventListner
{
	void perfromEvent();
}

interface MosuseListner extends EventListner 
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();	
}

interface Keylistener extends EventListner 
{
	void keyPressed();
	void keyReleased();
}

class Demo11 implements MosuseListner,Keylistener
{
	public void mouseClicked()
	{
		System.out.println("Mose clicked");
	}

	public void mousePressed()
	{
		System.out.println("Mouse Pressed");
	}

	public void mouseReleased()
	{
		System.out.println("Mouse Released");
	}

	public void mouseMoved()
	{
		System.out.println("Mouse Moved");
	}

	public void mouseDragged()
	{
		System.out.println("Mouse Dragged");
	}

	public void keyReleased()
	{
		System.out.println("Key realsed!!!!");
	}

	public void keyPressed()
	{
		System.out.println("Key Pressed!!!!");
	}

	public void perfromEvent()
	{
		System.out.println("Event Perfromed");
	}

	public static void main(String[] args) {
		
		Demo11 d1 = new Demo11();

		d1.mouseClicked();
		d1.mousePressed();
		d1.mouseReleased();
		d1.mouseMoved();
		d1.mouseDragged();

		d1.keyPressed();
		d1.keyReleased();

		d1.perfromEvent();
	}
}