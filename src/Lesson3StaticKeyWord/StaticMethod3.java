package Lesson3StaticKeyWord;

public class StaticMethod3 {

    int data = 100;
    static int data2 = 200;

    // This is Static Method
    static void staticMethod(){
        System.out.println("Programming foundations");
        // System.out.println(data); //you can not call non static variable inside static method
        System.out.println(data2); // you can call static variable inside static method

    }

    //This is no static Method or regular method
    void regularMethod(){
        System.out.println("Need to create an object to all this method");
        System.out.println(data); //you can call non static variable inside non static or regular method
        System.out.println(data2); // you can also call static variable inside non static or regular method
    }

    public static void main(String[] args) {
        StaticMethod3.staticMethod(); // Static method can be called directly by using class name
        StaticMethod3 obj = new StaticMethod3(); // To call regular method we need to create an object
        obj.regularMethod();
    }

}
