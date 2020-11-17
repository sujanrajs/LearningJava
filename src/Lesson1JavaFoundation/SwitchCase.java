package Lesson1JavaFoundation;

/*
Switch case statement is used when we have number of options (or choices)
and we may need to perform a different task for each choice.
 */

public class SwitchCase {
    public static void main(String[] args) {
        switchCaseExample1();
        System.out.println("-----------------");

        switchCaseExample2();
        System.out.println("-----------------");

        switchCaseExample2WithBreak();
        System.out.println("-----------------");

        switchCaseCharExample();
        System.out.println("-----------------");

        System.out.println("-----------------");

    }

    public static void switchCaseExample1(){
        int num=2;
        switch(num+2)
        {
            case 1:
                System.out.println("Case1: Value is: "+num);
            case 2:
                System.out.println("Case2: Value is: "+num);
            case 3:
                System.out.println("Case3: Value is: "+num);
            default:
                System.out.println("Default: Value is: "+num);
        }
    }

    /*
    Explanation: In switch I gave an expression, you can give variable also.
    I gave num+2, where num value is 2 and after addition the expression resulted 4.
    Since there is no case defined with value 4 the default case got executed.
    This is why we should use default in switch case,
    so that if there is no catch that matches the condition, the default block gets executed.
     */

    public static void switchCaseExample2(){
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Case1 ");
            case 2:
                System.out.println("Case2 ");
            case 3:
                System.out.println("Case3 ");
            case 4:
                System.out.println("Case4 ");
            default:
                System.out.println("Default ");
        }
    }

    /*
    In the above program, we have passed integer value 2 to the switch,
    so the control switched to the case 2, however we don’t have break statement
    after the case 2 that caused the flow to pass to the subsequent cases till the end.
    The solution to this problem is break statement
     */

    /*
    Break statements are used when you want your program-flow to come out of the switch body.
    Whenever a break statement is encountered in the switch body,
    the execution flow would directly come out of the switch, ignoring rest of the cases
     */

    public static void switchCaseExample2WithBreak(){
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            case 4:
                System.out.println("Case4 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

    /*
    Now you can see that only case 2 had been executed, rest of the cases were ignored.
    Why did not I use break statement after default?
    The control would itself come out of the switch after default so I did not use it,
    however if you still want to use the break after default then you can use it,
    there is no harm in doing that.
     */

    //You can also use characters in switch case. for example:

    public static void switchCaseCharExample(){
        char ch='b';
        switch(ch)
        {
            case 'd':
                System.out.println("Case1 ");
                break;
            case 'b':
                System.out.println("Case2 ");
                break;
            case 'x':
                System.out.println("Case3 ");
                break;
            case 'y':
                System.out.println("Case4 ");
                break;
            default:
                System.out.println("Default ");
        }
    }

    /*
    The expression given inside switch should result in a constant value otherwise
    it would not be valid.
    For example:

    Valid expressions for switch:
    switch(1+2+23)
    switch(1*2+3%4)

    Invalid switch expressions:
    switch(ab+cd)
    switch(a+b+c)
    Nesting of switch statements are allowed, which means you can have switch statements
    inside another switch. However nested switch statements should be avoided
    as it makes program more complex and less readable.
     */

}
