public class IntegerDataTypesExample {
    public static void main(String[] args) {
        // Primitive integer type (32-bit)
        int a = 100;

        // Primitive long type (64-bit)
        long b = 10000000000L; // Note the 'L' at the end to denote long literal

        // Wrapper class for int (Integer is an object)
        Integer c = Integer.valueOf(200);

        // Wrapper class for long (Long is an object)
        Long d = Long.valueOf(9000000000L);

        // Auto-boxing: primitive to wrapper conversion
        Integer e = a;  // int to Integer
        Long f = b;     // long to Long

        // Auto-unboxing: wrapper to primitive conversion
        int g = c;      // Integer to int
        long h = d;     // Long to long

        // Printing all variables
        System.out.println("int a = " + a);
        System.out.println("long b = " + b);
        System.out.println("Integer c = " + c);
        System.out.println("Long d = " + d);
        System.out.println("Auto-boxed Integer e = " + e);
        System.out.println("Auto-boxed Long f = " + f);
        System.out.println("Auto-unboxed int g = " + g);
        System.out.println("Auto-unboxed long h = " + h);
    }
}
