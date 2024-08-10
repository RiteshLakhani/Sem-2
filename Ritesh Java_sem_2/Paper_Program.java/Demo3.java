import java.util.Scanner;

public class Demo3
{
	public static void main(String[] args) {
		
		int a;
		try{

			a = Integer.parseInt(args[0]);

			for(int i=1 ; i<=10 ;i++)
			{
				System.out.println(a+"*"+i+"="+a*i);
			}
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.print("Plz Enter Valid Number!!!");
		}
	}
}