package Lesson13AbstractClass;

//abstract parent class
abstract class Animal {
    //abstract method
    public abstract void sound();
}

//Dog class extends Animal class
public class Dog extends Animal {

    public void sound() {
        System.out.println("Woof");
    }

    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.sound();
    }
}

/*
Hence for such kind of scenarios we generally declare the class as abstract and
later concrete classes extend these classes and override the methods accordingly and
can have their own methods as well.
 */