import java.util.Scanner;
import java.util.Stack;

public class recognize1 {
    public static boolean isValidString(String string) {
        Stack<Character> stack = new Stack<>();

        for (char ch : string.toCharArray()) {
            if (ch == 'a') {
                stack.push(ch);
            } else if (ch == 'b') {
                if (stack.isEmpty() || stack.peek() != 'a') {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isValidString(inputString)) {
            System.out.println("The string is of the form a^ib^i.");
        } else {
            System.out.println("The string is not of the form a^ib^i.");
        }
    }
}
