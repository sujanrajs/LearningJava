package Lesson9OverRiding;

/*
Lets take a simple example to understand this.
We have two classes: A child class Boy and a parent class Human.
The Boy class extends Human class. Both the classes have a common method void eat().
Boy class is giving its own implementation to the eat() method or
in other words it is overriding the eat() method.

The purpose of Method Overriding is clear here. Child class wants to give its own implementation
so that when it calls this method, it prints Boy is eating instead of Human is eating.
 */

public class HumanExample {
    //Overridden method
    public void eat() {
        System.out.println("Human is eating");
    }
}

class Boy extends HumanExample {
    //Overriding method
    public void eat() {
        System.out.println("Boy is eating");
    }

    public static void main(String args[]) {
        Boy obj = new Boy();
        //This will call the child class version of eat()
        obj.eat();
    }
}
