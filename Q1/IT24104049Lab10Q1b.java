import java.util.Scanner;

public class IT24104049Lab10Q1b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        // Check if mark is within valid range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        char grade;

        // Determine the grade
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Verify the grade using assertions
        assert (grade == 'A' && mark >= 75) ||
               (grade == 'B' && mark >= 60 && mark < 75) ||
               (grade == 'C' && mark >= 50 && mark < 60) ||
               (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade);
    }
}