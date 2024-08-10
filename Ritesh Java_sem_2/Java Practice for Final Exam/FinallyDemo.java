import java.util.Scanner;

public class FinallyDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int b = 5000;

		System.out.println("Enter Withdraw Amount: ");
		int a = sc.nextInt();

		try{

			if(b-a<1000)
			{
				throw new Exception ("B<1000 occured");
			}
			else{
				b = b - a ;
			}	
		}catch(Exception e){
			e.printStackTrace();
		}

		finally{
			sc.close();
		}
	}
}