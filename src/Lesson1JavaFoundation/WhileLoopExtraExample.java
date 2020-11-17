package Lesson1JavaFoundation;

import java.util.Scanner;

public class WhileLoopExtraExample {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            System.out.println("Hello5times");
            i++; //if you forget this then this will run infinite
        }
        System.out.println("---------------------------------");
        whiloop();
        YN();
        YN2();
    }
    //-----------------------------------------------------------------------------
    public static void whiloop() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        String answer = input.next();
        while (answer.equals("hello")){
            System.out.println("hello");
            answer = input.next();
        }
        System.out.println("goodbye");
    }
//-----------------------------------------------------------------------------
    /*
    The initialization not only sets the value of the running sum to zero,
    it also has to initialize the value of the variable number to a value
    that will “force” the loop to execute at least once.
    The update is the scanner input that changes the value of the number used in the test.
    Here’s an example while loop that does not let the user out until they enter "yes" or "no"
     */


    public static void YN(){
        String answer = "";
        Scanner input = new Scanner(System.in);
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Enter yes or no: ");
            answer = input.nextLine();
        }
        System.out.println("Thank you!");
    }
//-----------------------------------------------------------------------------

    public static void YN2() {
        System.out.print("Enter yes or no: ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Enter ONLY yes or no, please: ");
            answer = input.nextLine();
        }
        System.out.println("Thank you!");

    }
}

