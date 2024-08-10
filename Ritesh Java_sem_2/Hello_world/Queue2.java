import java.util.Scanner;

public class Queue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QueueImp q1 = new QueueImp();

        int ch;

        do {
            System.out.println("Enter 0 to Exit");
            System.out.println("Enter 1 to Insert");
            System.out.println("Enter 2 to Display");
            System.out.println("Enter 3 to Delete");

            System.out.println("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 0:
                    System.exit(0);
                case 1:
                    q1.insert();
                    break;
                case 2:
                    q1.display();
                    break;
                case 3:
                    q1.del();
                    break;
                default:
                    System.out.println("Please enter a valid number");
            }
        } while (ch != 0);
    }
}

class QueueImp {
    static Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    int front = 0;
    int rear = 0;

    public void insert() {
        if (rear == 5) {
            System.out.println("Queue is Full");
        } else {
            System.out.println("Enter Value: ");
            a[rear] = sc.nextInt();
            rear++;
        }
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public void del() {
        if (front == rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted element: " + a[front]);
            for (int i = 0; i < rear - 1; i++) {
                a[i] = a[i + 1];
            }
            rear--;
        }
    }
}
