package Lesson20InnerClass.StaticNestedClass;

/*
A static nested classes are the inner classes marked with static modifier.
Because this is static in nature so this type of inner class does not share
any special kind of relationship with an instance of outer class.A static nested

class cannot access non static members of outer class.

    Example:

    class Outer {
    static class Nested {
    }
    }

A static nested class can be instantiated like this:

class Outer {// outer class

    static class Nested {
    }// static nested class
}

class Demo {
    public static void main(string[] args) {
        // use both class names
        Outer.Nested n = new Outer.Nested();
    }
}

*/