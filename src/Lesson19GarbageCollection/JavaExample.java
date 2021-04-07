package Lesson19GarbageCollection;

/*
n this example we are demonstrating the garbage collection by calling System.gc().
In this code we have overridden a finalize() method.
This method is invoked just before a object is destroyed by java garbage collection process.
This is the reason you would see in the output that this method has been invoked twice.
 */

public class JavaExample {
    public static void main(String args[]) {
        /* Here we are intentionally assigning a null
         * value to a reference so that the object becomes
         * non reachable
         */
        JavaExample obj = new JavaExample();
        obj = null;

        /* Here we are intentionally assigning reference a
         * to the another reference b to make the object referenced
         * by b unusable.
         */
        JavaExample a = new JavaExample();
        JavaExample b = new JavaExample();
        b = a;
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed by JVM");
    }
}
