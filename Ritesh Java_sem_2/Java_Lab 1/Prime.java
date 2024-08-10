import java.util.*;

public class Prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);

		System.out.println("Enter A:");
		int a=s.nextInt();

		int flag=0;

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("variable"+a+"is a Prime No:");
		}
		else
		{
			System.out.println("variable"+a+"is not prime No:");
		}
	}
}