import java.util.*;
public class cal{
	public static void main(String args[]){

		Scanner s=new Scanner (System.in);

		System.out.println("Enter A");
		int a=s.nextInt();

		System.out.println("Enter B");
		int b=s.nextInt();

		System.out.println("1=Addition");
		System.out.println("2=Subtraction");
		System.out.println("3=Multiplication");
		System.out.println("4=Divison");

		System.out.println("Enter Choice:");
		int ch=s.nextInt();

		switch(ch)
		{
		case 1: 
			System.out.println("Addition:"+(a+b));
			break;

		case 2: 
			System.out.println("Subtraction:"+(a-b));
			break;

		case 3: 
			System.out.println("Multiplication:"+(a*b));
			break;

		case 4: 
			System.out.println("Divison:"+(a/b));
			break;


		} 

	}
}