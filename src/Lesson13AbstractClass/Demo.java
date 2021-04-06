package Lesson13AbstractClass;

/*
Example to demonstrate that object creation of abstract class is not allowed
As discussed above, we cannot instantiate an abstract class.
This program throws a compilation error.
 */

/*
abstract class AbstractDemo {
    public void myMethod() {
        System.out.println("Hello");
    }

    abstract public void anotherMethod();
}

public class Demo extends AbstractDemo {

    public void anotherMethod() {
        System.out.print("Abstract method");
    }

    public static void main(String args[]) {
        //error: You can't create object of it
        AbstractDemo obj = new AbstractDemo();
        obj.anotherMethod();
    }
}

 */