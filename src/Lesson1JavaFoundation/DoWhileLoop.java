package Lesson1JavaFoundation;

/*
do-while loop is similar to while loop, however there is a difference between them:
In while loop, condition is evaluated before the execution of loop’s body but
in do-while loop condition is evaluated after the execution of loop’s body.
 */

public class DoWhileLoop {
    public static void main(String[] args) {

        doWhileExample();
        System.out.println("----------------");

        iteratingArrayUsingDoWhileLoop();

    }

    public static void doWhileExample(){
        int i=10;
        do{
            System.out.println(i);
            i--;
        }while(i>1);
    }

    public static void iteratingArrayUsingDoWhileLoop(){
        int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0
        int i=0;
        do{
            System.out.println(arr[i]);
            i++;
        }while(i<4);
    }

}
