// HollowSquare.java
// Prints a hollow square pattern of stars

public class HollowSquare {
    public static void main(String[] args) {
        int size = 5;  // Size of the square

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print star on the border, space inside
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for inner area
                }
            }
            System.out.println();
        }
    }
}
