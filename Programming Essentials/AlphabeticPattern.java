// AlphabeticPattern.java
// Prints an alphabet pyramid pattern with consecutive letters

public class AlphabeticPattern {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows
        char ch = 'A'; // Starting alphabet

        for (int i = 1; i <= rows; i++) {
            // Print spaces before letters
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print letters for current row
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
                ch++;
                if (ch > 'Z') {  // Wrap around if past 'Z'
                    ch = 'A';
                }
            }
            System.out.println();
        }
    }
}
