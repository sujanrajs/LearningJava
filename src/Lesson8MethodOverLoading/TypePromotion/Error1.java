package Lesson8MethodOverLoading.TypePromotion;

/*
return type, method name and argument list same

It will throw a compilation error:
More than one method with same name and argument list cannot be defined in a same class.

public class Error1 {
    public int myMethod(int num1, int num2)
    {
        System.out.println("First myMethod of class Demo");
        return num1+num2;
    }
    public int myMethod(int var1, int var2)
    {
        System.out.println("Second myMethod of class Demo");
        return var1-var2;
    }
}
class Sample4
{
    public static void main(String args[])
    {
        Demo obj1= new Demo();
        obj1.myMethod(10,10);
        obj1.myMethod(20,12);
    }
}

 */