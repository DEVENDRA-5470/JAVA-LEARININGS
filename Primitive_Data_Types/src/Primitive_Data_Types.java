public class Primitive_Data_Types {
    public static void main(String[] args) {
        // 🟦 Integer Types

        // byte: 1 byte (8 bits), range: -128 to 127
        // ✅ Use when memory is limited or for file/stream handling
        byte myByte = 100;

        // short: 2 bytes (16 bits), range: -32,768 to 32,767
        // ✅ Used for small numeric values, rarely used
        short myShort = 20000;

        // int: 4 bytes (32 bits), range: -2^31 to 2^31-1
        // ✅ Most commonly used integer type (default for whole numbers)
        int myInt = 100000;

        // long: 8 bytes (64 bits), range: -2^63 to 2^63-1
        // ✅ Used when larger range is needed (e.g., timestamps, big counters)
        long myLong = 10000000000L;


        // 🟦 Floating-Point Types

        // float: 4 bytes (32 bits), precision: ~6-7 digits
        // ✅ Use when memory is a concern and accuracy can be slightly compromised
        float myFloat = 10.9999999f;

        // double: 8 bytes (64 bits), precision: ~15 digits
        // ✅ Default choice for decimals, better accuracy than float
        double myDouble = 20.999999999999999;


        // 🟦 Character Type

        // char: 2 bytes (16 bits), stores a single character (Unicode)
        // ✅ Used to store any single character (letter, digit, symbol)
        char myChar = 'A';


        // 🟦 Boolean Type

        // boolean: size not precisely defined (JVM optimized, typically 1 bit internally)
        // ✅ Used for true/false decisions, flags, and conditions
        boolean myBoolean = true;


        // 🟩 Print all values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
    }
}
