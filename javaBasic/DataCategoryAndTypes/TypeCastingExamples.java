public class TypeCastingExamples {
    public static void main(String[] args) {
        // ----- Implicit Casting (Widening) -----
        // Smaller type to larger type — automatic conversion by Java
        
        int intVal = 100;
        long longVal = intVal;           // int → long (32-bit to 64-bit)
        float floatVal = longVal;        // long → float
        double doubleVal = floatVal;     // float → double
        
        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);
        
        // ----- Explicit Casting (Narrowing) -----
        // Larger type to smaller type — requires manual cast
        
        double originalDouble = 123.456;
        float castedFloat = (float) originalDouble;  // double → float
        long castedLong = (long) castedFloat;        // float → long (fraction lost)
        int castedInt = (int) castedLong;            // long → int
        
        System.out.println("\nExplicit Casting:");
        System.out.println("double to float: " + castedFloat);
        System.out.println("float to long: " + castedLong);
        System.out.println("long to int: " + castedInt);
        
        // ----- Char and Numeric Casting -----
        
        char ch = 'Z';              // char value
        int chToInt = ch;           // char → int (implicit)
        char intToChar = (char) 65; // int → char (explicit) 'A'
        
        System.out.println("\nChar and Numeric Casting:");
        System.out.println("char to int: " + chToInt);
        System.out.println("int to char: " + intToChar);
        
        // ----- Boolean Casting -----
        // Boolean cannot be cast to/from other types in Java
        
        boolean boolVal = true;
        System.out.println("\nBoolean Value:");
        System.out.println("boolean: " + boolVal);
        System.out.println("Note: boolean cannot be cast to/from other types.");
    }
}
