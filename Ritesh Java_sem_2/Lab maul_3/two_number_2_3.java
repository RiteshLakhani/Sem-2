import java.util.Scanner;

public class two_number_2_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a+1;i<b;i++){
			if(i%2==0 && i%3!=0){
				System.out.println(i);
			}
			
		}

	}
}