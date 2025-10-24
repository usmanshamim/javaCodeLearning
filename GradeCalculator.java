import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for five subjects
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Biology: ");
        int biology = sc.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        int math = sc.nextInt();
        System.out.print("Enter marks for Computer: ");
        int computer = sc.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + biology + math + computer;
        double percentage = totalMarks / 5.0;

        // Determine grade based on percentage
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}