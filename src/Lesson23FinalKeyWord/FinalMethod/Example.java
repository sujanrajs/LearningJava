package Lesson23FinalKeyWord.FinalMethod;

/*
A final method cannot be overridden.
Which means even though a sub class can call the final method of parent class without
any issues but it cannot override it.
 */

class XYZ {
    final void demo() {
        System.out.println("XYZ Class Method");
    }
}

/*
class ABC extends XYZ {
    void demo() {
        System.out.println("ABC Class Method");
    }

    public static void main(String args[]) {
        ABC obj = new ABC();
        obj.demo();
    }
}

 */

// The above program would throw a compilation error,
// however we can use the parent class final method in sub class without any issues.