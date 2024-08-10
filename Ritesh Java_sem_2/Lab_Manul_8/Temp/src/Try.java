import java.util.Scanner;

public class Try{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Size of Array: ");
		int a = sc.nextInt();
			
		int [] n = new int [a];
		
		for ( int i=0 ; i<n.length ; i++)
		{
			System.out.println("Enter Number: ");
			n[i] = sc.nextInt();
		}
		int ans = whatever(n);
		System.out.println(ans);
		
	}
	
	static int whatever(int  a[]){
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]>a[i+1]) {
				return 0;
			}
			if(a[i]==a[i+1]){
				count++;
			}		}
		if(count<2) 
		{
			return 0;
		}
		else
		{
			return 1 ;
		}
	}
}
