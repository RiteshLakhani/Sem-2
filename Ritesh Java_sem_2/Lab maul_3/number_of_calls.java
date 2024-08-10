import java.util.Scanner;

public class number_of_calls{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of calls :");
		int n=sc.nextInt();
		double total=0;
		if(n<=100){
			total=200;
		}
		else if(n>100 && n<=150){
			total = 200 + 0.60*(float)(n-100);
		}
		else if(n>150 && n<=200){
			total = 200 + 0.60*(50) + 0.50*(float)(n-150);
		}
		else if(n>200){
			total = 200 + 0.60*(50) + 0.50*(50) + 0.40*(float)(n-200);
		}
		System.out.println("Total charge is "+total+"Rs");
	}
}