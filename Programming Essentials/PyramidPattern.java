// PyramidPattern.java
// Prints a pyramid star pattern with spaces

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = rows; j > i; j--) {
                System.out.print("  "); // Two spaces for better alignment
            }

            // Print stars in each row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
