import java.util.*;

public class Pattern
{
	public static void main(String [] args)
	{

		Scanner s=new Scanner (System.in);

		int  i,j,n,k;

		System.out.println("Enter Number: ");
		n=s.nextInt ();
		

		for(i=1;i<=2*n-1;i++)
		{
			k=n;
			if(i<=n)
			{
				for(j=1;j<=2*n-1;j++)
				{
					System.out.print(k+ );
					if(i>j)
					{
						k=k-1;
					}
					if((i+j)>=(2*n))
					{
						k=k+1;
					}
				}
			System.out.print("\n ");
			}
					
			else
			{
				for(j=1;j<=2*n-1;j++)
				{
					System.out.print(k+ );
					if((i+j)<(2*n))
					{
						k=k-1;
					}
					if(i<=j)
					{
						k=k+1;
					}
				}
				System.out.print("\n ");
			}
		}
	}
}
