package Lesson9OverRiding.SuperKeyWord;

/*
The super keyword is used for calling the parent class method/constructor. super.myMethod() calls
the myMethod() method of base class while super() calls the constructor of base class.
Let’s see the use of super in method Overriding.

As we know that we we override a method in child class,
then call to the method using child class object calls the overridden method.
By using super we can call the overridden method as shown in the example below:
 */

class ABC{
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}
class Demo extends ABC{
    public void myMethod(){
        //This will call the myMethod() of parent class
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main( String args[]) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}

//using super keyword, we can access the overriden method.