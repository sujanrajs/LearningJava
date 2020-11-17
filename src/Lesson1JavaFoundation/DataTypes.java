package Lesson1JavaFoundation;

public class DataTypes {
    public static void main(String[] args) {

        byte x;
        x = 113;
        System.out.println(x);
        /*
        This can hold whole number between -128 and 127.
        Mostly used to save memory and when you are certain that the numbers
        would be in the limit specified by byte data type.
        Default size of this data type: 1 byte.
        Default value: 0
         */

        short y;
        y = 150;
        System.out.println(y);

        /*
        This is greater than byte in terms of size and less than integer.
        Its range is -32,768 to 32767.
        Default size of this data type: 2 byte
        int: Used when short is not large enough to hold the number,
        it has a wider range: -2,147,483,648 to 2,147,483,647
        Default size: 4 byte
        Default value: 0
         */

        long z = -12332252626L;
        System.out.println(z);

        /*
        Used when int is not large enough to hold the value,
        it has wider range than int data type, ranging from
        -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        size: 8 bytes
        Default value: 0
         */

        double a = -42937737.9d;
        System.out.println(a);

        /*
        Sufficient for holding 15 decimal digits
        size: 8 bytes
         */

        float b = 19.98f;
        System.out.println(b);

        /*
        Sufficient for holding 6 to 7 decimal digits
        size: 4 bytes
         */

        boolean c = false;
        System.out.println(c);

        //holds either true of false.

        char ch = 'Z';
        System.out.println(ch);

        //holds characters. size: 2 bytes

    }
}
