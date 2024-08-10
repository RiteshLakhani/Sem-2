import java.util.Scanner;

public class Prime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No: ");
		int a = sc.nextInt ();

		boolean flag= false;

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag = true;
				break;
			}
		}

		if(!flag)
		{
			System.out.println("Enter No is Prime");
		}	
		else
		{
			System.out.println("Enter No not is Prime");
		}
	}
}