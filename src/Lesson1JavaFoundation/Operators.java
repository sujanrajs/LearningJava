package Lesson1JavaFoundation;

public class Operators {
    public static void main(String[] args) {
        arithmeticOperators();
        System.out.println("------------------------");

        assignmentOperator();
        System.out.println("------------------------");

        autoIncrementAutoDecrement();
        System.out.println("------------------------");

        logicalOperators();
        System.out.println("------------------------");

        comparisonOrRelationalOperator();
        System.out.println("------------------------");

        bitWiseOperator();
        System.out.println("------------------------");

        System.out.println("------------------------");

        System.out.println("------------------------");
    }

    public static void arithmeticOperators(){
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2) );
        System.out.println("num1 - num2: " + (num1 - num2) );
        System.out.println("num1 * num2: " + (num1 * num2) );
        System.out.println("num1 / num2: " + (num1 / num2) );
        System.out.println("num1 % num2: " + (num1 % num2) );
    }

    public static void assignmentOperator() {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("= Output: "+num2);

        num2 += num1;
        System.out.println("+= Output: "+num2);

        num2 -= num1;
        System.out.println("-= Output: "+num2);

        num2 *= num1;
        System.out.println("*= Output: "+num2);

        num2 /= num1;
        System.out.println("/= Output: "+num2);

        num2 %= num1;
        System.out.println("%= Output: "+num2);

    }

    public static void autoIncrementAutoDecrement(){
        int num1=100;
        int num2=200;
        num1++;
        num2--;
        System.out.println("num1++ is: "+num1);
        System.out.println("num2-- is: "+num2);
    }

    public static void logicalOperators(){
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + !(b1&&b2));
    }

    public static void comparisonOrRelationalOperator(){
        int num1 = 10;
        int num2 = 50;
        if (num1==num2) {
            System.out.println("num1 and num2 are equal");
        }
        else{
            System.out.println("num1 and num2 are not equal");
        }

        if( num1 != num2 ){
            System.out.println("num1 and num2 are not equal");
        }
        else{
            System.out.println("num1 and num2 are equal");
        }

        if( num1 > num2 ){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num1 is not greater than num2");
        }

        if( num1 >= num2 ){
            System.out.println("num1 is greater than or equal to num2");
        }
        else{
            System.out.println("num1 is less than num2");
        }

        if( num1 < num2 ){
            System.out.println("num1 is less than num2");
        }
        else{
            System.out.println("num1 is not less than num2");
        }

        if( num1 <= num2){
            System.out.println("num1 is less than or equal to num2");
        }
        else{
            System.out.println("num1 is greater than num2");
        }
    }

    public static void bitWiseOperator() {

        int num1 = 11;  /* 11 = 00001011 */
        int num2 = 22;  /* 22 = 00010110 */
        int result = 0;

        result = num1 & num2;
        System.out.println("num1 & num2: "+result);

        result = num1 | num2;
        System.out.println("num1 | num2: "+result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: "+result);

        result = ~num1;
        System.out.println("~num1: "+result);

        result = num1 << 2;
        System.out.println("num1 << 2: "+result); result = num1 >> 2;
        System.out.println("num1 >> 2: "+result);
    }

    /*
    Ternary operator evaluates a boolean expression and assign the value based on the result.
    Syntax:

    variable num1 = (expression) ? value if true : value if false
    If the expression results true then the first value before the colon (:)
    is assigned to the variable num1 else the second value is assigned to the num1.
     */

    public static void ternaryOperator() {
        int num1, num2;
        num1 = 25;
        /* num1 is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable num2
         */
        num2 = (num1 == 10) ? 100: 200;
        System.out.println( "num2: "+num2);

        /* num1 is equal to 25 that's why
         * the first value is assigned
         * to the variable num2
         */
        num2 = (num1 == 25) ? 100: 200;
        System.out.println( "num2: "+num2);
    }
}

/*
Operator Precedence in Java
This determines which operator needs to be evaluated first
if an expression has more than one operator.
Operator with higher precedence at the top and lower precedence at the bottom.

Unary Operators
++  – –  !  ~

Multiplicative
*  / %

Additive
+  –

Shift
<<  >>  >>>

Relational
>  >=  <  <=

Equality
==  !=

Bitwise AND
&

Bitwise XOR
^

Bitwise OR
|

Logical AND
&&

Logical OR
||

Ternary
?:

Assignment
=  +=  -=  *=  /=  %=  >  >=  <  <=  &=  ^=  |=
 */


/*
BIT WISE OPERATOR
There are six bitwise Operators: &, |, ^, ~, <<, >>

        num1 = 11; //equal to 00001011
        num2 = 22; //equal to 00010110

        Bitwise operator performs bit by bit processing.
        num1 & num2 compares corresponding bits of num1 and num2 and generates 1
        if both bits are equal, else it returns 0.
        In our case it would return: 2 which is 00000010 because
        in the binary form of num1 and num2 only second last bits are matching.

        num1 | num2 compares corresponding bits of num1 and num2 and generates 1
        if either bit is 1, else it returns 0. In our case it would return 31 which is 00011111

        num1 ^ num2 compares corresponding bits of num1 and num2 and generates 1
        if they are not equal, else it returns 0.
        In our example it would return 29 which is equivalent to 00011101

        ~num1 is a complement operator that just changes the bit from 0 to 1 and 1 to 0.
        In our example it would return -12 which is signed 8 bit equivalent to 11110100

        num1 << 2 is left shift operator that moves the bits to the left,
        discards the far left bit, and assigns the rightmost bit a value of 0.
        In our case output is 44 which is equivalent to 00101100

        Note: In the example below we are providing 2 at the right side of this shift operator
        that is the reason bits are moving two places to the left side.
        We can change this number and bits would be moved by the number
        of bits specified on the right side of the operator. Same applies to the right side operator.

        num1 >> 2 is right shift operator that moves the bits to the right,
        discards the far right bit, and assigns the leftmost bit a value of 0.
        In our case output is 2 which is equivalent to 00000010
 */