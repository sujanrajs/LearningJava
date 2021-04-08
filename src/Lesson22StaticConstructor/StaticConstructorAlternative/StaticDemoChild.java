package Lesson22StaticConstructor.StaticConstructorAlternative;

/*
Static Constructor Alternative – Static Blocks
Java has static blocks which can be treated as static constructor.
 */

public class StaticDemoChild extends StaticDemo {
    static {
        System.out.println("static block of child class");
    }

    public void display() {
        System.out.println("Just a method of child class");
    }

    public static void main(String args[]) {
        StaticDemoChild obj = new StaticDemoChild();
        obj.display();
    }
}

/*
Above example we have used static blocks in both the classes which worked perfectly.
We cannot use static constructor so it’s a good alternative
if we want to perform a static task during object creation.
 */
