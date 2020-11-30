package Lesson3StaticKeyWord;

/*
A static variable is common to all the instances (or objects) of the class because it is a class level variable.
In other words you can say that only a single copy of static variable is created
and shared among all the instances of the class.
Memory allocation for such variables only happens once when the class is loaded in the memory.

Few Important Points:
Static variables are also known as Class Variables.
Unlike non-static variables, such variables can be accessed directly in static and non-static methods.
 */

public class StaticVariableOne {
    static int var1;
    static String var2;

    //This is a Static Method
    static void disp(){
        System.out.println("Var1 is: "+var1);
        System.out.println("Var2 is: "+var2);
    }

    public static void main(String[] args)
    {
        disp();
    }
}
