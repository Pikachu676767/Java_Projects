import java.util.Scanner;

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // O mai gahhh, very flexibleee !!! I'm proud of this one
        int section = 2;
        int student = 3;
        String subjects[] = {"Java", "Database", "Networking"};
        
        int studentTable[][][] = new int[section][student][subjects.length];

        float sumStudentGrade = 0f;
        float sumSectionGrade = 0f; 

        for (int i = 0; i < studentTable.length; i++) {
            System.out.println("SECTION " + (i + 1));
            System.out.println("--------------------");
            
            for (int j = 0; j < studentTable[i].length; j++) {
                System.out.println("Student " + (j + 1));

                for (int k = 0; k < studentTable[i][j].length; k++) {
                    System.out.print(subjects[k] + ": ");
                    studentTable[i][j][k] = scanner.nextInt();

                    sumStudentGrade += studentTable[i][j][k];
                }
                
                System.out.printf("> Student Average: %.2f", (sumStudentGrade / subjects.length));
                sumSectionGrade += (sumStudentGrade / subjects.length);
                sumStudentGrade = 0f;

                System.out.println("\n");
            }
            
            System.out.printf("> Section Average: %.2f", (sumSectionGrade / studentTable[i].length));
            sumSectionGrade = 0f;

            System.out.println("\n");
        }

        scanner.close();
    }
}
