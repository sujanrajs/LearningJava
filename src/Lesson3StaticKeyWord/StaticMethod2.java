package Lesson3StaticKeyWord;

public class StaticMethod2 {
    static int i = 100;
    static String s = "MacBook";

    //Static method
    static void display()
    {
        System.out.println("i:"+i);
        System.out.println("i:"+s);
    }

    //non-static method
    void fun()
    {
        //Static method called in non-static method
        display();
    }


    //static method
    public static void main(String[] args)
    {
        StaticMethod2 obj = new StaticMethod2();
        //You need to have object to call this non-static method
        obj.fun();

        //Static method called in another static method
        display();
    }
}
