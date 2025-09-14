// A simple Java program to demonstrate the use of print() and println()

public class PrintAndPrintln {

    // Main method - the entry point of any Java program
    public static void main(String[] args) {
        
        // Using print() - prints without moving to a new line
        System.out.print("Hello, this is printed using print(). ");
        
        // Using println() - prints and moves to a new line
        System.out.println("Now this is printed using println().");
        
        // Another println() to show the line break effect
        System.out.println("Each println statement starts on a new line.");
        
        // Using print() again
        System.out.print("This is ");
        System.out.print("on the same line because print() does not add a new line.");
    }
}
