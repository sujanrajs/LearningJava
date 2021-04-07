package Lesson18AccessModifiers.PublicAccessModifier;

// The members, methods and classes that are declared public can be accessed from anywhere.
// This modifier does not put any restriction on the access.

/*
Lets take the same example that we have seen above but this time the method subtractTwoNumbers()
has public modifier and class Test is able to access this method without even extending the Addition class.
This is because public modifier has visibility everywhere.
 */

import Lesson18AccessModifiers.Examples.*;

class Test{
    public static void main(String args[]){
        Addition obj = new Addition();
        System.out.println(obj.subtractTwoNumbers(10, 5));
    }
}
