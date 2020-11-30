package Lesson3StaticKeyWord;

/*

Static block is used for initializing the static variables.
This block gets executed when the class is loaded in the memory.
A class can have multiple Static blocks, which will execute in the same sequence
in which they have been written into the program.

As you can see that both the static variables were intialized before we accessed them in the main method.

 */

public class SingleStaticBlock {
    static int num;
    static String mystr;
    static{
        num = 97;
        mystr = "Static keyword in Java";
    }
    public static void main(String[] args)
    {
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+mystr);
    }

}
