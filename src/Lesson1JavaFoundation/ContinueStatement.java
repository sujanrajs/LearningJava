package Lesson1JavaFoundation;

/*
Continue statement is mostly used inside loops.
Whenever it is encountered inside a loop, control directly jumps to the
beginning of the loop for next iteration,
skipping the execution of statements inside loop’s body for the current iteration.
This is particularly useful when you want to continue the loop but
do not want the rest of the statements(after continue statement)
in loop body to execute for that particular iteration.
 */

public class ContinueStatement {
    public static void main(String[] args) {

        continueStatementInsideForLoop();
        System.out.println("------------------");

        continueStatementInsideWhileLoop();
        System.out.println("------------------");

        continueStatementInsideDoWhileLoop();

    }

    public static void continueStatementInsideForLoop(){
        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {
                continue;
            }

            System.out.print(j+" ");
        }
    }

    /*
    As you may have noticed, the value 4 is missing in the output, why?
    because when the value of variable j is 4, the program encountered a continue statement,
    which makes it to jump at the beginning of for loop for next iteration,
    skipping the statements for current iteration
    (that’s the reason println did not execute when the value of j was 4).
     */

    public static void continueStatementInsideWhileLoop(){
        int counter=10;
        while (counter >=0)
        {
            if (counter==7)
            {
                counter--;
                continue;
            }
            System.out.print(counter+" ");
            counter--;
        }
    }

    public static void continueStatementInsideDoWhileLoop(){
        int j=0;
        do
        {
            if (j==7)
            {
                j++;
                continue;
            }
            System.out.print(j+ " ");
            j++;
        }while(j<10);

    }

}
