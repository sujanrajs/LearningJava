package Lesson1JavaFoundation;

public class ForLoop {
    public static void main(String[] args) {

        example1();
        System.out.println("----------------");

        forLoopToIterateArray();
        System.out.println("-----------------");

        enhanceForLoop();
        System.out.println("-----------------");

        enhanceForloop2();
        System.out.println("-----------------");

        //uncomment bottom line to try infinite loop !!
        //infiniteForLoop();

    }

    public static void example1(){
        for(int i=10; i>1; i--){
            System.out.println("The value of i is: "+i);
        }
    }

    public static void infiniteForLoop(){
        for(int i=1; i>=1; i++){
            System.out.println("The value of i is: "+i);
        }
    }

    //For loop example to iterate an array
    public static void forLoopToIterateArray(){
        int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //ENHANCE FOR LOOP
    /*
    Enhanced for loop is useful when you want to iterate Array/Collections,
    it is easy to write and understand.

    Let’s take the same example that we have written above and rewrite it using enhanced for loop.
     */

    public static void enhanceForLoop(){
        int arr[]={2,11,45,9};
        for (int num : arr) {
            System.out.println(num);
        }
    }

    /*
    Note: In the above example, I have declared the num as int in the enhanced for loop.
    This will change depending on the data type of array.
    For example, the enhanced for loop for string type would look like this:
     */

    public static void enhanceForloop2(){
        String arr[]={"hi","hello","bye"};
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
