class SmartPhone
{
	public void setAlarm()
	{
		System.out.println("Goto Apps\nOpen clock\nSet Alaram");
	}
}

class Iphone extends SmartPhone
{
	public void setAlarm()
	{
		System.out.println("Tell siri to set Alaram");
	}
}

public  class Demo6
{
	public static void main(String[] args) {
		
		SmartPhone s1 = new SmartPhone();
		System.out.println("--SmartPhone--");
		s1.setAlarm();


		System.out.println();
		System.out.println();

		Iphone i1 = new Iphone();
		System.out.println("--Iphone--");
		i1.setAlarm();
	}
}