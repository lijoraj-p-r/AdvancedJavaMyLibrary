/*
 * Different Main Method Syntaxes - Explained
 * Example Java file demonstrating various valid main method formats.
 */

public class MainMethodExamples {

    // 1. Standard main method
    public static void main(String[] args) {
        System.out.println("Main method example - Standard");
    }

    // 2. Swapped static and public
    static public void mainAlt1(String[] args) {
        System.out.println("Main method example - Alt 1 (static-public)");
    }

    // 3. Using String args[]
    public static void mainAlt2(String args[]) {
        System.out.println("Main method example - Alt 2 (String args[])");
    }

    // 4. Using varargs
    public static void mainAlt3(String... args) {
        System.out.println("Main method example - Alt 3 (varargs)");
    }

    // 5. Custom parameter name
    public static void mainAlt4(String[] myArgs) {
        System.out.println("Main method example - Alt 4 (custom arg name)");
    }
}
