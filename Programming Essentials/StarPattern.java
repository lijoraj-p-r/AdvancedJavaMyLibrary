// StarPattern.java
// Prints a right-angled triangle pattern using stars

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star and space
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
