package JavaFoundationPrograms;

/*
Program to check whether the given number is positive or negative
In this program we have specified the value of number during declaration
and the program checks whether the specified number is positive or negative.
To understand this program you should have the basic knowledge of
if-else-if statement in Core Java Programming.
 */

public class IfElseIfProgram {
    public static void main(String[] args) {
        int number = -1;

        if (number > 0) {
            System.out.println(number + " :is positive number");
        }

        else if(number < 0){
            System.out.println(number + " :is negative number");
        }

        else{
            System.out.println("Error");
        }

    }
}
