import java.util.Scanner;

public class Pra_11 
{
    public static void main(String[] args)
    {
        int number, originalNumber, remainder, result = 0, n = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        originalNumber = number;

        // count number of digits
        while (originalNumber != 0) 
        {
            originalNumber /= 10;
            n++;
        }

        originalNumber = number;

        // calculate result
        while (originalNumber != 0) 
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == number)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }    
        
    }
}
