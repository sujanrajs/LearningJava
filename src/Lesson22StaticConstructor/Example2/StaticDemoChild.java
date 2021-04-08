package Lesson22StaticConstructor.Example2;

public class StaticDemoChild extends StaticDemo {
    public StaticDemoChild() {
        /*By default super() is hidden here */
        System.out.println("StaticDemoChild");
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
Did you notice? When we created the object of child class, it first invoked the constructor of
parent class and then the constructor of it’s own class.
It happened because the new keyword creates the object and then invokes the constructor for initialization,
since every child class constructor by default has super() as first statement which calls it’s
parent class’s constructor. The statement super() is used to call the parent class(base class) constructor.

This is the reason why constructor cannot be static –
Because if we make them static they cannot be called from child class thus object of child class
cannot be created.

Constructor definition should not be static because constructor will be called each and every time
when object is created. If you made constructor as static then the constructor will be called
before object creation same like main method.
 */