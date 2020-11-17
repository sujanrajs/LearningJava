package Lesson2Constructors;

/*
Constructor with no arguments is known as no-arg constructor.
The signature is same as default constructor,
however body can have any code unlike default constructor where the body of the constructor is empty.

Although you may see some people claim that that default and no-arg constructor
is same but in fact they are not, even if you write
public Demo() { } in your class Demo it cannot be called default constructor
since you have written the code of it.
 */


public class NoArgConstructor {
    public NoArgConstructor(){
        System.out.println("This is No Argument Constructor");
    }

    public static void main(String[] args) {
        new NoArgConstructor();
    }
}
