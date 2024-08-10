import java.util.Scanner;

public class Factorail_Recursion 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        int a = sc.nextInt();

        sc.close();

        int ans;

        ans=fact(a);

        System.out.println("Factorail of "+a+" is :"+ans);
    }
    
    public static int fact(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
