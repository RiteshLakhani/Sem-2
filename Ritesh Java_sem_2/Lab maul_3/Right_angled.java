import java.util.Scanner;

public class Right_angled{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side of a triangle :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a==b && b==c){
			System.out.println("Equilateral triangle");
		}
		else if(a==b && b!=c || a!=b && b==c || a==c && c!=b){
			System.out.println("Isosceles triangle");
		}
		else if(a!=b && b!=c){
			System.out.print("Scalene triangle ");
		}

		if((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) || (Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)) || (Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)) ){
			System.out.println("& Right angled triangle");
		}
	}
}