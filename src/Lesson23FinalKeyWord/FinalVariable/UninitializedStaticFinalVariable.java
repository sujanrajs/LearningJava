package Lesson23FinalKeyWord.FinalVariable;

// A static final variable that is not initialized during declaration can only be initialized in static block.

class Example {
    //static blank final variable
    static final int ROLL_NO;

    static {
        ROLL_NO = 1230;
    }

    public static void main(String args[]) {
        System.out.println(Example.ROLL_NO);
    }
}
