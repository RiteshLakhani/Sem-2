public class EvenOrOdd{
    public static void main(String[] args) {
        
        int number;
        try 
        {
            number = Integer.parseInt(args[0]);

            if (number % 2 == 0) 
            {
                System.out.println(number + " is even.");
            } 
            else 
            {
            System.out.println(number + " is odd.");
            }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number provided.");
        }
    }
}
