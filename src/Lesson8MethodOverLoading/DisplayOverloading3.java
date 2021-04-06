package Lesson8MethodOverLoading;

/*

Overloading – Sequence of data type of arguments

Here method disp() is overloaded based on sequence of data type of parameters –
Both the methods have different sequence of data type in argument list.
First method is having argument list as (char, int) and second is having (int, char).
Since the sequence is different, the method can be overloaded without any issues.

 */

public class DisplayOverloading3 {
    public void disp(char c, int num) {
        System.out.println("I’m the first definition of method disp");
    }

    public void disp(int num, char c) {
        System.out.println("I’m the second definition of method disp");
    }
}

class Sample3 {
    public static void main(String args[]) {
        DisplayOverloading3 obj = new DisplayOverloading3();
        obj.disp('x', 51);
        obj.disp(52, 'y');
    }
}
