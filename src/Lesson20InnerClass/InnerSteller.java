package Lesson20InnerClass;

class Outside {
    int a = 0;

    class Inside {
        int b = 5;

    }

    // This class does not know outside class, only knows what is inside of static curly braces
    static class StaticInside{
        int c = 10;
    }

    // This class can not be accessed
    private class PrivateInside{
        int y = 15;
    }
}

public class InnerSteller {
    public static void main(String[] args) {

        Outside o = new Outside(); // Outside object has to be made
        Outside.Inside i = o.new Inside(); // Inside object has to be made
        System.out.println(o.a + " " + i.b);

        Outside.StaticInside x = new Outside.StaticInside();
        System.out.println(x.c);

    }
}
