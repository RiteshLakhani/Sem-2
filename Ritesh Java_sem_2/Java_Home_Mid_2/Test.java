class Bicycle
{
 	public int speed;
 	public int gear;

 	public Bicycle(int speed,int gear)
 	{
 		this.speed = speed ; 
 		this.gear = gear ;
 	}

 	public void appliedBreak(int decrement)
 	{
 		speed -= decrement;
 	}

 	public void speedUp(int increment)
 	{
 		speed += increment;
 	}

 	public String toStirng()
 	{
 		return ("No of Gears are " + gear + "\n" + "Speed of the Bicycle is "+speed);
 	}
}

class MountBicycle extends Bicycle
{
	public int seatHeight;

	public MountBicycle(int speed,int gear,int startHeight)
	{
		super(speed,gear);
		seatHeight = startHeight;
	}

	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}

	@Override public String toString()
	{
		return(super.toStirng()+ "Seat Height is " +seatHeight);
	}
}

public class Test
{
	public static void main(String[] args) {
		
		MountBicycle b1 = new MountBicycle(100,3,25);
		System.out.println(b1.toStirng());
	}
}