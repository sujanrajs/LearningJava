package Lesson9OverRiding.Rules;

/*
However this is perfectly valid scenario as public is less restrictive than protected.
Same access modifier is also a valid one.
 */

public class MyBaseClass2 {
    protected void disp()
    {
        System.out.println("Parent class method");
    }
}
class MyChildClass2 extends MyBaseClass2{
    public void disp(){
        System.out.println("Child class method");
    }
    public static void main( String args[]) {
        MyChildClass2 obj = new MyChildClass2();
        obj.disp();
    }
}
