import java.util.Scanner;

public class TimeDemo {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();

        t2.addTime(t1);

    }
}

class Time {
    int hour, minute, second;

    Time() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter HOUR   : ");
        hour = sc.nextInt();

        System.out.print("Enter MINUTE : ");
        minute = sc.nextInt();

        System.out.print("Enter SECOND : ");
        second = sc.nextInt();

    }

    public void addTime(Time temp) 
    {
        this.hour += temp.hour;
        this.minute += temp.minute;
        this.second += temp.second;

        if (second >= 60) {
            minute++;
            second -= 60;
        }

        if (minute >= 60) {
            hour++;
            minute -= 60;
        }

        try 
        {
            
            // System.out.println("Time : " + String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute)
            //         + ":" + String.format("%02d", this.second));

            System.out.println("TIME : ");
            Thread.sleep(500);
            System.out.print(String.format("%02d", this.hour) + ":");
            Thread.sleep(500);
            System.out.print(String.format("%02d", this.minute) + ":");
            Thread.sleep(500);
            System.out.print(String.format("%02d", this.second));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}