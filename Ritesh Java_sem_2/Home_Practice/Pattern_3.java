import java.util.Scanner;

public class Pra_22_Pattern_1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No Of Rows: ");
        int rows = sc.nextInt();


        int number = 1;
        char character = 'A';

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) 
            {
                if (i%2==0) 
                {
                    System.out.print(" "+character++ +" ");
                }
                else 
                {
                    System.out.print(" "+number++ + " ");
                }
            }

            System.out.println();
        }
    }
}
