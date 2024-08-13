import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        System.out.print("Python Programing: ");
        double subject1 = scanner.nextDouble();

        System.out.print("CGM: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Object Oriented Programming with UML: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Web Technology: ");
        double subject4 = scanner.nextDouble();

        System.out.print("IDT-2: ");
        double subject5 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
