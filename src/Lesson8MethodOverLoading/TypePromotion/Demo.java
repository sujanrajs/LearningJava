package Lesson8MethodOverLoading.TypePromotion;

/*
it is very important to understand type promotion else you will think that
the program will throw compilation error but in fact that program will run fine because of type promotion.
 */

public class Demo {
    void disp(int a, double b) {
        System.out.println("Method A");
    }

    void disp(int a, double b, double c) {
        System.out.println("Method B");
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        /* I am passing float value as a second argument but
         * it got promoted to the type double, because there
         * wasn't any method having arg list as (int, float)
         */
        obj.disp(100, 20.67f);
    }
}

/*
I have passed the float value while calling the disp() method but it got
promoted to the double type as there wasn’t any method with argument list as (int, float)
But this type promotion doesn’t always happen, lets see another example:
 */