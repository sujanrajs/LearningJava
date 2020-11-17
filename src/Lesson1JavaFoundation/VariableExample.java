package Lesson1JavaFoundation;

public class VariableExample{
    static int staticVariableExample = 30;
    // Static variable are within the class and need to use static key word
    // Can be used inside class and is independent
    // Only one copy is created per class


    int instanceVariableExample = 20;
    // Instance Variable are declared inside class but not method
    // Always gets the default value
    // Can not be reinitialized directly within a class
    // but can be reinitialized inside method or constructor

    void methodExample(){
        int localVariableExample = 10;
        // Local variables are declared inside methods or method parameters
        // Local Variables are not accessible outside methods
        // Local variables don't have any default value
        instanceVariableExample = 25; //instance variable can be reinitialized inside method
    }

    int methodExampleTwo(int a, int b){ // a and b are parameters, local variables
        int total = a+b; // total is also a local variable
        return total;
    }

    public static void main(String[] args) {
        VariableExample obj1 = new VariableExample();
        System.out.println(obj1.instanceVariableExample);

        System.out.println(VariableExample.staticVariableExample);
        // Static Variable can be called using class name
        // no object is needed to call static variable


    }
}
