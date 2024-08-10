class Time
{
	int h ;
	int m ; 
	int s; 

	Time(int h , int m , int s)
	{
		this.h = h;
		this.m = m;
		this.s = s;
	}

	void add(Time t)
	{
		this.s += t.s;
		if(this.s>=60)
		{
			this.m++;
			this.s-=60;
		}

		this.m += t.m;
		if(this.m>=60)
		{
			this.h++;
			this.m-=60;
		}

		this.h += t.h;
	}
}

public class Passing
{
	public static void main(String[] args) 
	{
		Time t1 = new Time(61,61,61);
		Time t2 = new Time(61,61,61);

		t1.add(t2);
		System.out.println(t1.h+":"+t1.m+":"+t1.s);	
	}
}