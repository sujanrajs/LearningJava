package Lesson10OverLoadingVSOverRiding;

//A class for adding upto 5 numbers
//Here we have 4 versions of same method add. We are overloading the method add() here.

public class OverLoading {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    int add(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    int add(int n1, int n2, int n3, int n4, int n5) {
        return n1 + n2 + n3 + n4 + n5;
    }

    public static void main(String args[]) {
        OverLoading obj = new OverLoading();
        System.out.println("Sum of two numbers: " + obj.add(20, 21));
        System.out.println("Sum of three numbers: " + obj.add(20, 21, 22));
        System.out.println("Sum of four numbers: " + obj.add(20, 21, 22, 23));
        System.out.println("Sum of five numbers: " + obj.add(20, 21, 22, 23, 24));
    }
}
