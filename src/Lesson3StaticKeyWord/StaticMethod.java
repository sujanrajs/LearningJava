package Lesson3StaticKeyWord;

/*
Static Methods can access class variables(static variables) without using object(instance) of the class,
however non-static methods and non-static variables can only be accessed using objects.
Static methods can be accessed directly in static and non-static methods.
Syntax:
Static keyword followed by return type, followed by method name.
static return_type method_name();
 */

//static method main is accessing static variables without object
//We need object to call regular method
//Static method can be called without objects
//Can't call non-static variable or methods directly in static method
public class StaticMethod {
    static int i = 10;
    static String s = "Java";

    //This is a static method
    public static void main(String args[])
    {
        System.out.println("i:"+i);
        System.out.println("s:"+s);
    }
}
