package Lesson3StaticKeyWord;

public class StaticIntro {

    int a = 0;
    static int x = 1;
    static int months = 12; // This can be static because 12 months are always same

    public static void main(String[] args) {
        int b = 2;

        // System.out.println(a);
        // you cannot print a because it is not static but you can print b
        System.out.println(b);

        // to use the global variable a above you need make an object to call it or make it static

        StaticIntro s = new StaticIntro();
        System.out.println(s.a); // a is called via object

        //x is made static above
        System.out.println(x); // you can print x because it is static.

        System.out.println(months);
    }
}
