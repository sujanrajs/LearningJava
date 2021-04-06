package Lesson9OverRiding.Rules;

// This is not allowed as child class disp method is more restrictive(protected) than base class(public)

public class MyBaseClass {
    public void disp() {
        System.out.println("Parent class method");
    }
}

class MyChildClass extends MyBaseClass {
    //protected void disp(){
    //
    public void disp() {
        System.out.println("Child class method");
    }

    public static void main(String args[]) {
        MyChildClass2 obj = new MyChildClass2();
        obj.disp();
    }
}
