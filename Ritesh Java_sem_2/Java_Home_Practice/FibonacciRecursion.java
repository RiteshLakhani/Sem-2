import java.util.Scanner;
public class FibonacciRecursion {

  public static int fibonacci(int num) {
    if (num == 0 || num == 1) { // base case
      return num;
    } else {
      return fibonacci(num-1) + fibonacci(num-2); // recursive call
    }
  }

  public static void main(String[] args) {
    //int num = 10; // the number of terms to generate in the Fibonacci sequence

    Scanner sc = new Scanner(System.in);

    int n;

    System.out.println("Enter Number Of term");
    n = sc. nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }
}