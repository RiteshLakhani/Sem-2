import java.util.Scanner;
//stydiopedia 
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.pritln("Enter Array of Size");
		int a = sc.nextInt();
		
		int [] n = new int [a];
		
		for(int i=0; i<n.length ; i++)
		{
			System.out.println("Enter Number: ");
			n[i] = sc.nextInt();		
		}
		
		for(int i = 0 ; i<n.length ; i++)
		{
			System.out.println("Enterd Number: "+n[i]);
		}

	}

}

