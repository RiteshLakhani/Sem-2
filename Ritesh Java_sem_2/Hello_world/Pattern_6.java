import java.util.*;

public class Pattern_6
{
	public static void main(String args[])
	{

		for(int i=1;i<=5;i++)
		{
			

			for(int k=5;k>i;k--)
			{
				System.out.print(" ");	
			}

			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");	
			}
			System.out.print("\n");

		}

		for(int i=4;i>=1;i--)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");	
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");	
			}
			System.out.print("\n");

		}
		
	}
}