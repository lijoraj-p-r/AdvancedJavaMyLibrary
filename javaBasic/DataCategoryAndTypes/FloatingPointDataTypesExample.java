public class FloatingPointDataTypesExample {
    public static void main(String[] args) {
        // Primitive float type (32-bit)
        float a = 10.5f; // 'f' is required to indicate a float literal

        // Primitive double type (64-bit)
        double b = 20.123456789;

        // Wrapper class for float
        Float c = Float.valueOf(15.75f);

        // Wrapper class for double
        Double d = Double.valueOf(30.987654321);

        // Auto-boxing: converting primitive to object
        Float e = a;     // float → Float
        Double f = b;    // double → Double

        // Auto-unboxing: converting object to primitive
        float g = c;     // Float → float
        double h = d;    // Double → double

        // Print all values
        System.out.println("float a = " + a);
        System.out.println("double b = " + b);
        System.out.println("Float c = " + c);
        System.out.println("Double d = " + d);
        System.out.println("Auto-boxed Float e = " + e);
        System.out.println("Auto-boxed Double f = " + f);
        System.out.println("Auto-unboxed float g = " + g);
        System.out.println("Auto-unboxed double h = " + h);
    }
}
