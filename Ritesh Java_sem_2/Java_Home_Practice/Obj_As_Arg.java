class Time{
	int hour;
	int min;
	int sec;

	Time(int hour, int min, int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}

	void add(Time t)
	{
		this.sec = this.sec + t.sec ;
		if(this.sec>=60)
		{
			this.min++;
			this.sec--;
		}

		this.min = this.min - t.min;
		if(this.min>=60)
		{
			this.hour++;
			this.min--;
		}

		this.hour = this.hour + t.hour;
		
	}
}

public class Obj_As_Arg
{
	public static void main(String [] args)
	{
		Time t1 = new Time(1,35,27);
		Time t2 = new Time(7,5,25);

		t1.add(t2);

		System.out.println(t1.hour+":"+t1.min+":"+t1.sec);
	}
}