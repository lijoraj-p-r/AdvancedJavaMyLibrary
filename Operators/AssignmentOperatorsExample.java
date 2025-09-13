public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10;   // Simple assignment
        System.out.println("Initial value: a = " + a);

        a += 5;       // a = a + 5
        System.out.println("After a += 5: a = " + a);

        a -= 3;       // a = a - 3
        System.out.println("After a -= 3: a = " + a);

        a *= 2;       // a = a * 2
        System.out.println("After a *= 2: a = " + a);

        a /= 4;       // a = a / 4
        System.out.println("After a /= 4: a = " + a);

        a %= 3;       // a = a % 3
        System.out.println("After a %= 3: a = " + a);

        a <<= 2;      // a = a << 2 (left shift by 2 bits)
        System.out.println("After a <<= 2: a = " + a);

        a >>= 1;      // a = a >> 1 (right shift by 1 bit)
        System.out.println("After a >>= 1: a = " + a);

        a &= 6;       // a = a & 6 (bitwise AND with 6)
        System.out.println("After a &= 6: a = " + a);

        a ^= 2;       // a = a ^ 2 (bitwise XOR with 2)
        System.out.println("After a ^= 2: a = " + a);

        a |= 1;       // a = a | 1 (bitwise OR with 1)
        System.out.println("After a |= 1: a = " + a);
    }
}
