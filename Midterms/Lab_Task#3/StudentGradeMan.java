import java.util.Scanner;

public class StudentGradeMan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");

            System.out.print("Student Number\t\t: ");
            int studentNumber = scanner.nextInt(); scanner.nextLine();
            System.out.print("Student Name\t\t: ");
            String studentName = scanner.nextLine();
            System.out.print("Course\t\t\t: ");
            String studentCourse = scanner.nextLine();
            System.out.print("Year Level\t\t: ");
            int studentYearLevel = scanner.nextInt();;

        System.out.println("----------------------------------------");

            System.out.println("Enter Grades:");
            System.out.print("Grade 1\t\t\t: ");
            float g1 = scanner.nextFloat();
            System.out.print("Grade 2\t\t\t: ");
            float g2 = scanner.nextFloat();
            System.out.print("Grade 3\t\t\t: ");
            float g3 = scanner.nextFloat();
            
            float average = getAverage(g1, g2, g3);

        System.out.println("----------------------------------------");

            System.out.print("Display Letter Grade or Numeric Grade[L|N]? ");
            char typeOfGradeFormat = scanner.next().toUpperCase().charAt(0);

        System.out.println("----------------------------------------");

            studInfo(studentNumber, studentName, studentCourse, studentYearLevel);

        System.out.println("----------------------------------------");

            displayResult(average);
            getEquiv(average, typeOfGradeFormat);

        System.out.println("----------------------------------------");

        scanner.close();
    }

    public static float getAverage(float g1, float g2, float g3) {

        return (g1 + g2 + g3) / 3;
    }

    public static String getRemark(float average) {

        if (average >= 60) return "Remarks\t\t\t: Passed";
        else return "Remarks\t\t\t: Failed";
    }

    public static void displayResult(float average) {

        System.out.printf("Average is\t\t: %.2f%n", average);
        System.out.println(getRemark(average));
    }

    public static void studInfo(int studentNumber, String studentName, String studentCourse, int studentYearLevel) {
        
        String yearLevel = " ";
        switch (studentYearLevel) {
            case 1: yearLevel = "First Year";
            case 2: yearLevel = "Second Year";
            case 3: yearLevel = "Third Year";
            case 4: yearLevel = "Fourth Year";
        }
        System.out.printf("Student Details: %d %s %s%n", studentNumber, studentCourse, yearLevel);
        System.out.println("Full Name: " + studentName);
    }

    public static void getEquiv(float average, char grade) {

        char letterGrade = ' ';
        String numberGrade = " ";

        switch (grade) {
            case 'L':
                if (average >= 90 && average <= 100) letterGrade = 'A';
                else if (average >= 83 && average <= 89) letterGrade = 'B';
                else if (average >= 75 && average <= 82) letterGrade = 'C';
                else if (average >= 60 && average <= 74) letterGrade = 'D';
                else letterGrade = 'F';

                System.out.println("Letter Grade is\t\t: " + letterGrade);
                break;
                
            case 'N':
                if (average >= 96 && average <= 100) numberGrade = "4.00";
                else if (average >= 90 && average <= 95) numberGrade = "3.50";
                else if (average >= 84 && average <= 89) numberGrade = "3.00";
                else if (average >= 77 && average <= 83) numberGrade = "2.50";
                else if (average >= 70 && average <= 76) numberGrade = "2.00";
                else numberGrade = "1.00";

                System.out.println("Number Grade is\t\t: " + numberGrade);
                break;

            default: System.out.println("N/A");;
        }
    }
}
