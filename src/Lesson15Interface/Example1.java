package Lesson15Interface;

/*
This is how a class implements an interface.
It has to provide the body of all the methods that are declared in interface or in other words
you can say that class has to implement all the methods of interface.

Do you know? class implements interface but an interface extends another interface.
 */

interface MyInterface {
    /* compiler will treat them as:
     * public abstract void method1();
     * public abstract void method2();
     */
    public void method1();

    public void method2();
}

class Demo implements MyInterface {
    /* This class must have to implement both the abstract methods
     * else you will get compilation error
     */
    public void method1() {
        System.out.println("implementation of method1");
    }

    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String arg[]) {
        MyInterface obj = new Demo();
        obj.method1();
    }
}