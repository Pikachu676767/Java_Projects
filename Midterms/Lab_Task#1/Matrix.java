import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) throws InterruptedException {
        
        // Inserts Scanner class that accepts keyboard input
        Scanner scanner = new Scanner(System.in);
        // Make a while loop
        boolean isRetry = true;
        while (isRetry) {
            // Initializing the dimensions
            int matrix[][] = new int[3][3]; //0.00

            // This block of code accepts user input, traversing in each cell
            System.out.println("\nEnter 9 values!\n");
            printTable(matrix); // This one prints the default board with no values yet via a method because I want it stylish and readable for the user
            // This for loop access the rows
            for (int x = 0; x < matrix.length; x++) {
                // This for loop access the columns
                for (int y = 0; y < matrix[x].length; y++) {
                    System.out.printf("%n> Cell[%d][%d]: ", x, y);
                    matrix[x][y] = scanner.nextInt();
                    
                    printTable(matrix); // Updates the board to let the user know
                }
            }
            // Calculating the sum of rows and columns via a method again because I want to
            System.out.println("\nCalculating...");
            Thread.sleep(1000); // Add a delay for more immersiveness
            // Prints the board
            calculateRowsAndColumns(matrix);

            // After the program is done, it prompts user if they want to retry or not
            System.out.print("> Wanna do it again? [Y/N]: ");
            isRetry = (scanner.next().toLowerCase().charAt(0) == 'y');
        }
        System.out.println("> Have a nice day!");
        scanner.close();
    }

    static void printTable(int matrix[][]) {
        // Prints the board. I wanna do it this way because it's more readable and for stylistic purposes
        System.out.println(
            "        0\t\t1\t\t2" +
            "\n0 :\t" + matrix[0][0] + "\t|\t" + matrix[0][1] + "\t|\t" + matrix[0][2] +
            "\n   -------------+---------------+---------------" +
            "\n1 :\t" + matrix[1][0] + "\t|\t" + matrix[1][1] + "\t|\t" + matrix[1][2] +
            "\n   -------------+---------------+---------------" +
            "\n2 :\t" + matrix[2][0] + "\t|\t" + matrix[2][1] + "\t|\t" + matrix[2][2]
        );
    }

    static void calculateRowsAndColumns(int matrix[][]) {
        int sumRow1 = matrix[0][0] + matrix[0][1] + matrix[0][2];
        int sumRow2 = matrix[1][0] + matrix[1][1] + matrix[1][2];
        int sumRow3 = matrix[2][0] + matrix[2][1] + matrix[2][2];

        int sumCol1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int sumCol2 = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int sumCol3 = matrix[0][0] + matrix[1][1] + matrix[2][2];

        // Prints the board but with different thing"
        System.out.println(
            "\t\t\t\t\t\t  Row" +
            "\n\t" + matrix[0][0] + "\t|\t" + matrix[0][1] + "\t|\t" + matrix[0][2] + "\t = " + sumRow1 +
            "\n   -------------+---------------+---------------" +
            "\n\t" + matrix[1][0] + "\t|\t" + matrix[1][1] + "\t|\t" + matrix[1][2] + "\t = " + sumRow2 +
            "\n   -------------+---------------+---------------" +
            "\n\t" + matrix[2][0] + "\t|\t" + matrix[2][1] + "\t|\t" + matrix[2][2] + "\t = " + sumRow3 +
            "\n\t=\t\t=\t\t=" +
            "\nColumn\t" + sumCol1 + "\t\t" + sumCol2 + "\t\t" + sumCol3
        );
    }
}
