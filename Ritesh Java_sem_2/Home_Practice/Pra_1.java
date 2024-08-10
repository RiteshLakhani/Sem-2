import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private String name;
    private int roll;
    private double cpi;

    public Student(String name, int roll, double cpi) {
        this.name = name;
        this.roll = roll;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getCpi() {
        return cpi;
    }
}

public class Pra_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] studentsArray = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i+1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the roll number of student " + (i+1) + ": ");
            int roll = scanner.nextInt();
            System.out.print("Enter the CPI of student " + (i+1) + ": ");
            double cpi = scanner.nextDouble();

            studentsArray[i] = new Student(name, roll, cpi);
        }

        // Sort the student array by CPI
        Arrays.sort(studentsArray, Comparator.comparingDouble(Student::getCpi));

        // Print the sorted student details
        System.out.println("Sorted Student Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + studentsArray[i].getName());
            System.out.println("Roll Number: " + studentsArray[i].getRoll());
            System.out.println("CPI: " + studentsArray[i].getCpi());
        }
    }
}
