public class Para_Con{
	public static void main(String[] args)
	{
		Rect r1 = new Rect(6,6,false);
		System.out.println(r1.isFilled);

	}
}

class Rect{
	int len ; 
	int wid ;
	boolean isFilled;

	public Rect(int l , int w , boolean isF)
	{
		len = l;
		wid = w;
		isFilled = isF;
	}
}