public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("Prime numbers among the first 20 odd numbers:");

        while (count < 20) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number += 2; // Increment by 2 to check only odd numbers
        }
    }
}
