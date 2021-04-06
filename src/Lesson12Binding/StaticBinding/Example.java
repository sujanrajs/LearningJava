package Lesson12Binding.StaticBinding;

/*
OR EARLY BINDING
Static binding example
Here we have two classes Human and Boy.
Both the classes have same method walk() but the method is static,
which means it cannot be overriden so even though I have used the object of Boy class
while creating object obj, the parent class method is called by it.
Because the reference is of Human type (parent class). So whenever a binding of
static, private and final methods happen, type of the class is determined by the compiler
at compile time and the binding happens then and there.
 */

class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}

class Boy extends Human {
    public static void walk() {
        System.out.println("Boy walks");
    }

    public static void main(String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        Human obj = new Boy();
        /* Reference is of HUman type and object is
         * of Human type.
         */
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();
    }
}