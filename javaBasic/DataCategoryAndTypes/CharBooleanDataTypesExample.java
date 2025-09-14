public class CharBooleanDataTypesExample {
    public static void main(String[] args) {
        // Primitive char type (16-bit, stores a single Unicode character)
        char letter = 'A';

        // Primitive boolean type (stores true or false)
        boolean isJavaFun = true;

        // Wrapper class for char
        Character wrappedLetter = Character.valueOf('B');

        // Wrapper class for boolean
        Boolean wrappedBoolean = Boolean.valueOf(false);

        // Auto-boxing: primitive to object
        Character autoBoxedChar = letter;         // char → Character
        Boolean autoBoxedBoolean = isJavaFun;     // boolean → Boolean

        // Auto-unboxing: object to primitive
        char unboxedChar = wrappedLetter;         // Character → char
        boolean unboxedBoolean = wrappedBoolean;  // Boolean → boolean

        // Printing all values
        System.out.println("char letter = " + letter);
        System.out.println("boolean isJavaFun = " + isJavaFun);
        System.out.println("Character wrappedLetter = " + wrappedLetter);
        System.out.println("Boolean wrappedBoolean = " + wrappedBoolean);
        System.out.println("Auto-boxed Character = " + autoBoxedChar);
        System.out.println("Auto-boxed Boolean = " + autoBoxedBoolean);
        System.out.println("Auto-unboxed char = " + unboxedChar);
        System.out.println("Auto-unboxed boolean = " + unboxedBoolean);
    }
}
