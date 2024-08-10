import java.util.Scanner;

class Node {
    int no;
    Node next;
}

public class LinkedList {
    private static Node f = null;
    private static Node r = null;

    public static void main(String[] args) {
        int ch;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n 0 for Exit:");
            System.out.println(" 1 for Insert:");
            System.out.println(" 2 for Display:");
            System.out.print("\n Enter choice: ");
            ch = scanner.nextInt();

            switch (ch) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                default:
                    System.out.println("Enter a valid number.");
            }
        } while (ch != 0);
    }

    private static void insert() {
        Scanner scanner = new Scanner(System.in);
        Node n = new Node();

        System.out.print("\n Enter Value: ");
        n.no = scanner.nextInt();

        if (f == null && r == null) {
            f = n;
            r = n;
            r.next = null;
        } else {
            r.next = n;
            r = n;
            r.next = null;
        }
    }

    private static void display() {
        if (f == null && r == null) {
            System.out.println("\n List Is Empty");
        } else {
            Node i = f;
            while (i != null) {
                System.out.print(" " + i.no);
                System.out.println();
                i = i.next;
            }
        }
    }
}
