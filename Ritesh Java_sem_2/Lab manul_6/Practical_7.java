import java.util.Scanner;

public class Practical_7
{
	public static void main(String[]args)
	{
		 Time t1 = new Time();
        Time t2 = new Time();

        t2.addTime(t1);
	}
}

class Time
{
	int hour,min,sec;

	Time()
	{
		Scanner sc = new Scanner ( System.in );

		System.out.print("Enter HOUR   : ");
        hour = sc.nextInt();

        System.out.print("Enter MINUTE : ");
        min = sc.nextInt();

        System.out.print("Enter SECOND : ");
        sec = sc.nextInt();
	}

	public void addTime(Time temp)//non static.
	{
		this.hour += temp.hour;
		this.min += temp.min;
		this.sec += temp.sec;

		if(sec>=60)
		{
			min++;
			sec-=60;
		}

		if(min>=60)
		{
			hour++;
			min-=60;
		}

		try
		{
			System.out.println("TIME : ");
            Thread.sleep(500);
            System.out.print(String.format("%02d", this.hour) + ":");
            Thread.sleep(500);
            System.out.print(String.format("%02d", this.min) + ":");
            Thread.sleep(500);
            System.out.print(String.format("%02d", this.sec));
		} catch(Exception e){
		//  exception is never empty.
			}
	}
}	
