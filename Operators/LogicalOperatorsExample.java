public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND (&&) - true if both operands are true
        System.out.println("x && y = " + (x && y));  // false

        // Logical OR (||) - true if at least one operand is true
        System.out.println("x || y = " + (x || y));  // true

        // Logical NOT (!) - inverts the boolean value
        System.out.println("!x = " + (!x));          // false
        System.out.println("!y = " + (!y));          // true

        // Logical XOR (^) - true if operands are different
        System.out.println("x ^ y = " + (x ^ y));    // true
        System.out.println("x ^ x = " + (x ^ x));    // false
    }
}
