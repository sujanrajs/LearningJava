package Lesson8MethodOverLoading;

/*

Overloading – Difference in data type of parameters

In this example, method disp() is overloaded based on the data type of parameters –
We have two methods with the name disp(), one with parameter of char type and another method
with the parameter of int type.



 */

public class DisplayOverloading2 {
    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(int c) {
        System.out.println(c);
    }
}

class Sample2 {
    public static void main(String args[]) {
        DisplayOverloading2 obj = new DisplayOverloading2();
        obj.disp('a');
        obj.disp(5);
    }
}
