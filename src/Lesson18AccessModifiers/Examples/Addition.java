package Lesson18AccessModifiers.Examples;

public class Addition {
    /* Since we didn't mention any access modifier here, it would
     * be considered as default.
     */
    int addTwoNumbers(int a, int b){
        return a+b;
    }

    protected int multiplyTwoNumbers(int a, int b){
        return a*b;
    }

    public int subtractTwoNumbers(int a, int b){
        return a-b;
    }
}
