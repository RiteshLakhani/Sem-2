import java.util.*;

public class Reverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n=sc.nextInt();
		int i;
		while(n>0){
			i=n%10;
			n=n/10;
			System.out.print(i);
		}
	}
}