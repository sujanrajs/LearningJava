package Lesson8MethodOverLoading;

/*

Overloading – Different Number of parameters in argument list

method overloading is done by declaring same method with different parameters.
The parameters must be different in either of these: number, sequence or types of parameters (or arguments).

method disp() is overloaded based on the number of parameters –
We have two methods with the name disp but the parameters they have are different.
Both are having different number of parameters.

 */


public class DisplayOverloading {
    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}

class Sample {
    public static void main(String args[]) {
        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp('a', 10);
    }
}
