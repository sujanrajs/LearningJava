package Lesson9OverRiding;

/*
Method Overriding and Dynamic Method Dispatch

Method Overriding is an example of runtime polymorphism.
When a parent class reference points to the child class object then the call to the overridden method
is determined at runtime, because during method call which method(parent class or child class)
is to be executed is determined by the type of object. This process in which call to the overridden method
is resolved at runtime is known as dynamic method dispatch. Lets see an example to understand this:
 */

public class ABC {
    //Overridden method
    public void disp() {
        System.out.println("disp() method of parent class");
    }
}

class Demo extends ABC {
    //Overriding method
    public void disp() {
        System.out.println("disp() method of Child class");
    }

    public void newMethod() {
        System.out.println("new method of child class");
    }

    public static void main(String args[]) {
        /* When Parent class reference refers to the parent class object
         * then in this case overridden method (the method of parent class)
         *  is called.
         */
        ABC obj = new ABC();
        obj.disp();

        /* When parent class reference refers to the child class object
         * then the overriding method (method of child class) is called.
         * This is called dynamic method dispatch and runtime polymorphism
         */
        ABC obj2 = new Demo();
        obj2.disp();
    }
}

/*
In the above example the call to the disp() method using second object (obj2) is
runtime polymorphism (or dynamic method dispatch).
Note: In dynamic method dispatch the object can call the overriding methods of child class
and all the non-overridden methods of base class but it cannot call the methods
which are newly declared in the child class. In the above example the object obj2 is calling the disp().
However if you try to call the newMethod() method (which has been newly declared in Demo class)
using obj2 then you would give compilation error with the following message:

Exception in thread "main" java.lang.Error: Unresolved compilation
problem: The method xyz() is undefined for the type ABC
 */