package Lesson23FinalKeyWord.FinalVariable;

/*
A final variable that is not initialized at the time of declaration is known as blank final variable.
We must initialize the blank final variable in constructor of the class
otherwise it will throw a compilation error (Error: variable MAX_VALUE might not have been initialized).
 */

class Demo {
    //Blank final variable
    final int MAX_VALUE;

    Demo() {
        //It must be initialized in constructor
        MAX_VALUE = 100;
    }

    void myMethod() {
        System.out.println(MAX_VALUE);
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
