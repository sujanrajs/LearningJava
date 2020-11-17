package Lesson1JavaFoundation;

/*
In while loop, condition is evaluated first and if it returns true then
the statements inside while loop execute. When condition returns false,
the control comes out of loop and jumps to the next statement after while loop.
 */

public class WhileLoop {
    public static void main(String[] args) {

        simpleWhileLoop();
        System.out.println("-----------------");

        iteratingArrayUsingWhileLoop();
        System.out.println("-----------------");

        //remove comment from below line to use infinite loop
        //infiniteWhileLoop();

    }

    public static void simpleWhileLoop(){
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }

    public static void infiniteWhileLoop(){
        int i=10;
        while(i>1)
        {
            System.out.println(i);
            i++;
        }
    }

    public static void iteratingArrayUsingWhileLoop(){
        int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        int i=0;
        while(i<4){
            System.out.println(arr[i]);
            i++;
        }
    }

}
