public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // Example 1: * has higher precedence than +
        int result1 = a + b * c;
        // Evaluates as a + (b * c) = 10 + (20*30) = 10 + 600 = 610
        System.out.println("a + b * c = " + result1);

        // Example 2: Parentheses override precedence
        int result2 = (a + b) * c;
        // Evaluates as (10 + 20) * 30 = 30 * 30 = 900
        System.out.println("(a + b) * c = " + result2);

        // Example 3: Associativity of subtraction (left to right)
        int result3 = a - b - c;
        // Evaluates as (a - b) - c = (10 - 20) - 30 = -10 - 30 = -40
        System.out.println("a - b - c = " + result3);

        // Example 4: Associativity of assignment (right to left)
        int d, e;
        d = e = 100;  // Equivalent to d = (e = 100)
        System.out.println("d = " + d + ", e = " + e);

        // Example 5: Mixed operators with different precedence
        int result4 = a + b / c - 5;
        // Evaluates as a + (b / c) - 5 = 10 + (20/30) - 5
        // Integer division: 20/30 = 0
        // So 10 + 0 - 5 = 5
        System.out.println("a + b / c - 5 = " + result4);
    }
}
