package Lesson20InnerClass.MethodLocalInnerClass;

/*
A method local inner class is defined within a method of the enclosing class.
If you want to use inner class , you must instantiate the inner class in the same method,
but after the class definition code.
Only two modifiers are allowed for method-local inner class which are abstract and final
The inner class can use the local variables of the method (in which it is present),
only if they are marked final.
 */

//Top level class definition
class MyOuterClassDemo {
    private int x = 1;

    public void doThings() {
        String name = "local variable";
        // inner class defined inside a method of outer class
        class MyInnerClassDemo {
            public void seeOuter() {
                System.out.println("Outer Value of x is :" + x);
                System.out.println("Value of name is :" + name);//compilation error!!
            } //close inner class method
        } // close inner class definition
    } //close Top level class method
} // close Top level class

/*
The above code will throw a compilation error as Inner class cannot use
the non-final variables of the method, in which it is defined.
This is how it can be fixed: If we mark the variable as final then inner class can use it.

final String name ="local variable";// inner object can use it

 */