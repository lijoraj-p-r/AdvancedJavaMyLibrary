// ReverseNumber.java
// Reverses an integer number

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;  // Extract last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            number /= 10;  // Remove last digit from original number
        }

        System.out.println("Reversed number: " + reversed);
    }
}
