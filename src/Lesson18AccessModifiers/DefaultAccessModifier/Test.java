package Lesson18AccessModifiers.DefaultAccessModifier;

/*
When we do not mention any access modifier, it is called default access modifier.
The scope of this modifier is limited to the package only.
This means that if we have a class with the default access modifier in a package,
only those classes that are in this package can access this class.
No other class outside this package can access this class. Similarly,
if we have a default method or data member in a class,
it would not be visible in the class of another package.
 */

/*
In this example we have two classes, Test class is trying to access the default method of Addition class,
since class Test belongs to a different package, this program would throw compilation error,
because the scope of default modifier is limited to the same package in which it is declared.
Addition.java
 */

/* We are importing the Package Lesson18AccessModifiers.Examples.Addition
 * but still we will get error because the
 * class we are trying to use has default access
 * modifier.
 */

import Lesson18AccessModifiers.Examples.*;

public class Test {
    public static void main(String args[]){
        Addition obj = new Addition();
        /* It will throw error because we are trying to access
         * the default method in another package
         */
        //obj.addTwoNumbers(10, 21);
    }
}

/*
Output:

java: addTwoNumbers(int,int) is not public in Lesson18AccessModifiers.Examples.Addition;
cannot be accessed from outside package
 */