import java.util.Scanner;

public class TimeDemo2
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);

		Time t1= new Time();

		System.out.println("Enter First time HH: ");
		int h = sc.nextInt();
		

		System.out.println("Enter First time MM: ");
		int m = sc.nextInt();

		t1.setHM(h , m);
		


		Time t2= new Time();
		
		System.out.println("Enter Second time HH: ");
		 h = sc.nextInt();
		

		System.out.println("Enter Second time MM: ");
		 m = sc.nextInt();
		t2.setHM(h , m);

		Time t3=new Time();
		t3=t3.add(t1,t2);

		System.out.print(t3.getHH()+":"+t3.getMM());

	}
}

class Time
{
  private int hh;
  private int mm;

  Time()
  {
  	hh=0;
  	mm=0;
  }

  public void setHM(int hh , int mm)
  {
  	this.hh=hh;
  	this.mm=mm;
  }
  public int getHH()
  {
  	return hh;
  	
  } 

  // public void setMM(int mm)
  // {
  // 	this.mm=mm;
  // }
  public int getMM()
  {
  	return mm;
  }

  Time(int hh, int mm)
  {
  	this.hh=hh;
  	this.mm=mm;
  } 

  public  Time add(Time t, Time t1 )
  {
  	t.mm+=t1.mm;
  	t.hh+=t1.hh;
  	if (t.mm>=60) {
  		t.hh+=1;
  		t.mm-=60;
  	}
  	return t;
  }

}
