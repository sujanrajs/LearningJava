package Lesson1JavaFoundation;

/*
The break statement is usually used in following two scenarios:

a) Use break statement to come out of the loop instantly.
Whenever a break statement is encountered inside a loop,
the control directly comes out of loop and the loop gets terminated for rest of the iterations.
It is used along with if statement, whenever used inside loop so that the loop gets terminated
for a particular condition.

The important point to note here is that when a break statement is used inside a nested loop,
then only the inner loop gets terminated.

b) It is also used in switch case control.
Generally all cases in switch case are followed by a break statement so that
whenever the program control jumps to a case,
it does not execute subsequent cases (see the example below).
As soon as a break is encountered in switch-case block,
the control comes out of the switch-case body.
 */

public class BreakStatement {
    public static void main(String[] args) {

        breakInForLoop();
        System.out.println("-----------------");

        breakInWhileLoop();
        System.out.println("-----------------");

        breakInSwitchCase();
        System.out.println("-----------------");

    }

    public static void breakInWhileLoop(){
        int num =0;
        while(num<=100)
        {
            System.out.println("Value of variable is: "+num);
            if (num==2)
            {
                break;
            }
            num++;
        }
        System.out.println("Out of while-loop");
    }

    public static void breakInForLoop(){
        int var;
        for (var =100; var>=10; var --)
        {
            System.out.println("var: "+var);
            if (var==99)
            {
                break;
            }
        }
        System.out.println("Out of for-loop");
    }

    public static void breakInSwitchCase(){
        int num=2;

        switch (num)
        {
            case 1:
                System.out.println("Case 1 ");
                break;
            case 2:
                System.out.println("Case 2 ");
                break;
            case 3:
                System.out.println("Case 3 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

}
