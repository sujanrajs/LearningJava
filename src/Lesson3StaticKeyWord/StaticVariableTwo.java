package Lesson3StaticKeyWord;

/*
In this example, String variable is non-static and integer variable is Static.
As you can see in the output that the non-static variable is different for both the objects
but the static variable is shared among them,
that's the reason the changes made to the static variable by object ob2 reflects in both the objects.
 */

public class StaticVariableTwo {
    //Static integer variable
    static int var1=77;

    //non-static string variable
    String var2;

    public static void main(String[] args)
    {
        StaticVariableTwo ob1 = new StaticVariableTwo();
        StaticVariableTwo ob2 = new StaticVariableTwo();

        /* static variables can be accessed directly without
         * any instances. Just to demonstrate that static variables
         * are shared, I am accessing them using objects so that
         * we can check that the changes made to static variables
         * by one object, reflects when we access them using other
         * objects
         */
        //Assigning the value to static variable using object ob1

        var1=88;
        ob1.var2="I'm Object1";
        /* This will overwrite the value of var1 because var1 has a single
         * copy shared among both the objects.
         */
        var1=99;
        ob2.var2="I'm Object2";
        System.out.println("ob1 integer:"+ var1);
        System.out.println("ob1 String:"+ob1.var2);
        System.out.println("ob2 integer:"+ var1);
        System.out.println("ob2 String:"+ob2.var2);
    }
}
