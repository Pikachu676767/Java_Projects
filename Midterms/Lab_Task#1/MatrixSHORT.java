import java.util.Scanner;

public class MatrixSHORT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int matrix[][] = new int[3][3];

            System.out.println("\nEnter 9 integers!");
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < matrix[x].length; y++) {
                    System.out.printf("> Cell[%d][%d]: ", x, y);
                    matrix[x][y] = scanner.nextInt();
                }
            }

            int sumRow1 = matrix[0][0] + matrix[0][1] + matrix[0][2];
            int sumRow2 = matrix[1][0] + matrix[1][1] + matrix[1][2];
            int sumRow3 = matrix[2][0] + matrix[2][1] + matrix[2][2];

            int sumCol1 = matrix[0][0] + matrix[1][0] + matrix[2][0];
            int sumCol2 = matrix[0][1] + matrix[1][1] + matrix[2][1];
            int sumCol3 = matrix[0][2] + matrix[1][2] + matrix[2][2];

            System.out.println(
                "\t\tRow" +
                "\n\t" + matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + " = " + sumRow1 +
                "\n\t" + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + " = " + sumRow2 +
                "\n\t" + matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + " = " + sumRow3 +
                "\n\t= = =" +
                "\nColumn\t" + sumCol1 + " " + sumCol2 + " " + sumCol3
            );

            System.out.print("> Wanna do it again? [Y/N]: ");
        } while (scanner.next().toLowerCase().charAt(0) == 'y');

        System.out.println("> Have a nice day!");

        scanner.close();
    }
}
