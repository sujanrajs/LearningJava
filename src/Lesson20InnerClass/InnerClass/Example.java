package Lesson20InnerClass.InnerClass;

/*
Instantiating an inner class
To instantiate an instance of inner class, there should be a live instance of outer class.
An inner class instance can be created only from an outer class instance.
An inner class shares a special relationship with an instance of the enclosing class.
Instantiating an inner class from within code in outer class:
 */

class MyOuterClassDemo {
    private int x = 1;

    public void innerInstance() {
        MyInnerClassDemo inner = new MyInnerClassDemo();
        inner.seeOuter();
    }

    public static void main(String args[]) {
        MyOuterClassDemo obj = new MyOuterClassDemo();
        obj.innerInstance();
    }

    // inner class definition
    class MyInnerClassDemo {
        public void seeOuter() {
            System.out.println("Outer Value of x is :" + x);
        }
    } // close inner class definition
} // close Top level class definition

/*
Instantiating an inner class from outside the outer class Instance Code:
The public static void main code in the above example can be replaced with this one.
It will also give the same output.

    public static void main(String args[]){
    MyOuterClassDemo.MyInnerClassDemo inner = new MyOuterClassDemo().new MyInnerClassDemo();
    inner. seeOuter();
    }
 */