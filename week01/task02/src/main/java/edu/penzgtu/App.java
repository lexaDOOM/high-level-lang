package edu.penzgtu;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "INTEGER TYPES: " );
        System.out.println();
        // byte min and max values
        System.out.println( "byte min value: " + Byte.MIN_VALUE );  // min value is -128
        System.out.println( "byte max value: " + Byte.MAX_VALUE );  // max value is  127
        System.out.println();
        // For byte (8 bits) range is: from -(2^7) = -128 to 2^7 - 1 = 127
        // byte has 256 different values (2^8 = 256)

        // short min and max values
        System.out.println( "short min value: " + Short.MIN_VALUE );  // min value is -32768
        System.out.println( "short max value: " + Short.MAX_VALUE );  // max value is  32767
        System.out.println();
        // For short (16 bits) range is: from -(2^15) = -32768 to 2^15 - 1 = 32767
        // short has 65536 different values (2^16 = 65536)

        // int min and max values
        System.out.println( "int min value: " + Integer.MIN_VALUE );  // min value is -2147483648
        System.out.println( "int max value: " + Integer.MAX_VALUE );  // max value is  2147483647
        System.out.println();
        // For int (32 bits) range is: from -(2^31) = -2147483648 to 2^31 - 1 = 2147483647
        // int has 4294967296 different values (2^32 = 4294967296)

        // long min and max values
        System.out.println( "long min value: " + Long.MIN_VALUE );  // min value is -9223372036854775808
        System.out.println( "long max value: " + Long.MAX_VALUE );  // max value is  9223372036854775807
        System.out.println();
        // For long (64 bits) range is: from -(2^63) = -9223372036854775808 to 2^63 - 1 = 9223372036854775807
        // long has 18446744073709551616 different values (2^64 = 18446744073709551616)
    }
}
