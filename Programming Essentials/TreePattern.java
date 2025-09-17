// TreePattern.java
// Prints a tree-shaped star pattern

public class TreePattern {
    public static void main(String[] args) {
        int rows = 5; // Height of the tree

        // Print the leaves (pyramid part)
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars (2*i - 1)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the trunk (2 rows)
        for (int i = 1; i <= 2; i++) {
            // Spaces before trunk to center it
            for (int j = 1; j < rows; j++) {
                System.out.print(" ");
            }
            System.out.println("|"); // Trunk represented by '|'
        }
    }
}
