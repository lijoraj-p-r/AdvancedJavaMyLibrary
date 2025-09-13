public class UnaryOperatorsExample {
    public static void main(String[] args) {
        int a = 5;

        // Unary plus (+): Indicates positive value (usually redundant)
        int positive = +a;
        System.out.println("Unary plus (+a): " + positive);  // 5

        // Unary minus (-): Negates the value
        int negative = -a;
        System.out.println("Unary minus (-a): " + negative); // -5

        // Increment operator (prefix): increases value by 1 before use
        int preIncrement = ++a;  // a becomes 6, then used
        System.out.println("Prefix increment (++a): " + preIncrement);

        // Increment operator (postfix): increases value by 1 after use
        int postIncrement = a++; // used as 6, then a becomes 7
        System.out.println("Postfix increment (a++): " + postIncrement);

        // Decrement operator (prefix): decreases value by 1 before use
        int preDecrement = --a;  // a becomes 6, then used
        System.out.println("Prefix decrement (--a): " + preDecrement);

        // Decrement operator (postfix): decreases value by 1 after use
        int postDecrement = a--; // used as 6, then a becomes 5
        System.out.println("Postfix decrement (a--): " + postDecrement);

        // Logical complement operator (!): inverts boolean value
        boolean flag = true;
        System.out.println("Logical NOT (!flag): " + !flag);  // false
    }
}
