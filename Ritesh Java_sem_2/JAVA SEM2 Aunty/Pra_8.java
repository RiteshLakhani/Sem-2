
import java.util.Scanner;

public class Pra_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st1;
        System.out.print("Enter the String--1 : ");
        st1 = sc.nextLine();

        String st2;
        System.out.print("Enter the String--2 : ");
        st2 = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        // Convert String To StringBuffer
        sb.append(st1);

        // Reverse the StringBuffer
        sb.reverse();

        String sb1 = sb.toString(); // New String For Check (Reverse) Equality

        boolean b = st2.equalsIgnoreCase(sb1);

        if (b) {
            System.out.println("Both Strings Are Same");
        } else {
            System.out.println("Strings Are Not Same");
        }

        System.out.println();

    }
}
