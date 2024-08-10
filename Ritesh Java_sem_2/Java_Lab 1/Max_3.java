import java.util.*;
public class Max_3{

	public static void main(String args[]){

		Scanner s=new Scanner (System.in);

		System.out.println("Enter a");
		int a=s.nextInt();

		System.out.println("Enter b");
		int b=s.nextInt();

		System.out.println("Enter C");
		int c=s.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Max");
			}
			else
			{
				System.out.println("B is max");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is max");
			}
			else
			{
				System.out.println("C is max");
			}
		}
	} 
}