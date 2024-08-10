// Import the required classes from the student and exam packages
import student.Student;
import exam.Result;

public class MarkSheetGenerator {
    public static void main(String[] args) {
        // Create an array of students
        Student[] students = new Student[3];
        students[0] = new Student("John", "Doe", 12345);
        students[1] = new Student("Jane", "Doe", 67890);
        students[2] = new Student("Bob", "Smith", 24680);

        // Create an array of results
        Result[] results = new Result[3];
        results[0] = new Result(80, 70, 90);
        results[1] = new Result(85, 75, 95);
        results[2] = new Result(90, 80, 100);

        // Print the mark sheet for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getFirstName() + " " + students[i].getLastName());
            System.out.println("Roll No.: " + students[i].getRollNo());
            System.out.println("Marks:");
            System.out.println("Subject 1: " + results[i].getSubject1Marks());
            System.out.println("Subject 2: " + results[i].getSubject2Marks());
            System.out.println("Subject 3: " + results[i].getSubject3Marks());
            System.out.println("Total Marks: " + results[i].getTotalMarks());
            System.out.println("Percentage: " + results[i].getPercentage() + "%");
            System.out.println();
        }
    }
}
