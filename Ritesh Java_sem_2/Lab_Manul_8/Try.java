import java.util.Scanner;

public class Try{
	public static void main(String[] args) {
		System.out.println("hi");
		
		Scanner sc = new Scanner (System.in);
		
		int k = 0 ;
		
		System.out.println("Enter No  of Array: ");
		int a = sc.nextInt();
			
		int [] n = new int [a];
		
		for ( int i=0 ; i<n.length ; i++)
		{
			System.out.println("Enter Number: ");
			n[i] = sc.nextInt();
		}
		int ans = isTest(n);
		System.out.println(ans);
		
	}

	
	public static int isTest(int  a[])
	 {
		int count=0;
		for(int i=0;i<a.length-1;i++) 
		{
			
			if(a[i]>a[i+1]) 
			{
				return 0;
			}
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				if(count<2)
				{
					return 0;
				}
				count=0;
			}
		}			
		if(count<2)
		{
			return 0;
		}
		else{
			return 1;
		}
	}
}
