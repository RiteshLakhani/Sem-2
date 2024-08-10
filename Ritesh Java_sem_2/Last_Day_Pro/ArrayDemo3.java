import java.util.Scanner;

public class ArrayDemo3
{
	public static void main(String[] args)
	{
		int [] a = {5,3,6,8,9,2,4,1,11};

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();

		boolean flag = false;

		for(int i=0 ; i<a.length; i++)
		{
			if(a[i]==b)
			{
				System.out.println("Found at"+i);
				flag = true;
				break;
			}
		}

		if(!flag)
		{
			System.out.println("Number Does not Exists!!!!");
		}	
	}
}