import java.util.Scanner;

public class PalindromeRitesh{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        for(int i=0;i<str.length;i++){
            int ascii = (int)a1.charAt(i);
            if(ascii < 97){
                str += (char)ascii;
            }
            else{
                ascii = ascii-32;
                str += (char)ascii;
            }
        }
        
        boolean isPalindrome = true;
        int len = str.length();
        
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}
