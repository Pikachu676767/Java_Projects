import java.util.Scanner;

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // O mai gahhh, very flexibleee !!! I'm proud of this one
        int section = 2;
        int student = 3;
        String subjects[] = {"Java", "Database", "Networking"}; // Creating distinct strings in a for loop is hard. So I stored the subejcts in an array to iterate them instead.
        
        int studentTable[][][] = new int[section][student][subjects.length]; // Initializing the 3d array

        float sumStudentGrade = 0f; // initializing the sum of student's grade
        float sumSectionGrade = 0f; // Initializing the sum of the section's grade

        for (int i = 0; i < studentTable.length; i++) { // This loop is for the section
            System.out.println("SECTION " + (i + 1)); // Displays section number wiith +1 otherwise, it'll show up 0
            System.out.println("--------------------");
            
            for (int j = 0; j < studentTable[i].length; j++) { // This loop is for the students
                System.out.println("Student " + (j + 1)); // Displays student number with +1

                for (int k = 0; k < studentTable[i][j].length; k++) { // This loop are the subjects for each student
                    System.out.print(subjects[k] + ": "); // This iterates through the subjects they currently have
                    studentTable[i][j][k] = scanner.nextInt(); // This is where the user enters the subject grades and stores them in each student

                    sumStudentGrade += studentTable[i][j][k]; // Takes the same number the user inputed and stores them where it adds them
                }
                // When the innermost loop ends, this activates the computation for student average
                System.out.printf("> Student Average: %.2f", (sumStudentGrade / subjects.length));
                sumSectionGrade += (sumStudentGrade / subjects.length); // This stores the student's average grade and adds them to section grade to find the section's average
                sumStudentGrade = 0f; // Resets the variable to 0 so that it doesn't interfere (add up) with future student grades

                System.out.println("\n");
            }
            // When the middle loop ends, this activates the computation for the whole section's average
            System.out.printf("> Section Average: %.2f", (sumSectionGrade / studentTable[i].length));
            sumSectionGrade = 0f; // resets the variable to 0 so that it doesn't interfere (add up) with the next section's grades

            System.out.println("\n");
        }

        scanner.close();
    }
}
