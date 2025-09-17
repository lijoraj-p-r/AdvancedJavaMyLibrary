// NumberPyramidReset.java
// Prints a pyramid pattern where numbers start from 1 in each row

public class NumberPyramidReset {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces before numbers
            for (int j = rows; j > i; j--) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print numbers from 1 to i in each row
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to next line after each row
        }
    }
}
