public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int a = 6;  // Binary:  0110
        int b = 3;  // Binary:  0011

        // Bitwise AND (&): sets each bit to 1 if both bits are 1
        int andResult = a & b;  // 0110 & 0011 = 0010 (2)
        System.out.println("a & b = " + andResult);

        // Bitwise OR (|): sets each bit to 1 if at least one bit is 1
        int orResult = a | b;   // 0110 | 0011 = 0111 (7)
        System.out.println("a | b = " + orResult);

        // Bitwise XOR (^): sets each bit to 1 if only one bit is 1
        int xorResult = a ^ b;  // 0110 ^ 0011 = 0101 (5)
        System.out.println("a ^ b = " + xorResult);

        // Bitwise NOT (~): inverts all the bits
        int notResult = ~a;     // ~0110 = 1001 (in 32-bit signed int, it's -7)
        System.out.println("~a = " + notResult);

        // Left shift (<<): shifts bits to the left, fills with 0 on right
        int leftShift = a << 1; // 0110 << 1 = 1100 (12)
        System.out.println("a << 1 = " + leftShift);

        // Right shift (>>): shifts bits to the right, fills with sign bit on left
        int rightShift = a >> 1; // 0110 >> 1 = 0011 (3)
        System.out.println("a >> 1 = " + rightShift);

        // Unsigned right shift (>>>): shifts bits right, fills with 0 on left
        int unsignedRightShift = a >>> 1; // 0110 >>> 1 = 0011 (3)
        System.out.println("a >>> 1 = " + unsignedRightShift);
    }
}
