package Lesson13AbstractClass;

// An abstract class outlines the methods but not necessarily implements all the methods.

//Declaration using abstract keyword
abstract class A{
    //This is abstract method
    abstract void myMethod();

    //This is concrete method with body
    void anotherMethod(){
        //Does something
    }
}
