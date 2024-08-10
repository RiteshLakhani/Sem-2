import java.util.Scanner;

public class GCD_Recursive 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        sc.close();

        int gcd = findGCD(a,b);

        System.out.println("GCD Of "+a+" and "+b+" is " +gcd);
    }    

    public static int findGCD(int n , int m)
    {
        if(m==0)
        {
            return n;
        }
        else
        {
            return findGCD(m, n%m);
        }
    }
}
