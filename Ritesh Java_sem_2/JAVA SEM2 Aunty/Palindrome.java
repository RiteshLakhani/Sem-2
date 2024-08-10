import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if(isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static int isPalindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse(); // reverse the string
        String reversedStr = sb.toString(); // convert back to string
        if(str.equals(reversedStr)) {
            return 1;
        } else {
            return 0;
        }
    }
}
//In this program, we use the StringBuffer class to reverse the input string. We define the isPalindrome method, which takes a string as an argument and returns an integer value.

//Inside the method, we create a new StringBuffer object and pass the input string to its constructor. We then call the reverse method of the StringBuffer class to reverse the input string. We convert the reversed string back to a regular string using the `toString








