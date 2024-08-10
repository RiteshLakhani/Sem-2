public class Defalut_Con{
	public static void main(String[] args)
	{
		Rect r1 = new Rect();
		System.out.println(r1.len);

		Rect r2 = new Rect();
		System.out.println(r2.wid);
	}
}

class Rect{
	int len ; 
	int wid ;
	boolean isFilled;

	public Rect()
	{
		len = 6;
		wid = 6;
		isFilled = false;
	}
}