package Lesson12Binding.DynamicBinding;

/*
OR LATE BINDING

When compiler is not able to resolve the call/binding at compile time,
such binding is known as Dynamic or late Binding.
Method Overriding is a perfect example of dynamic binding as in overriding both
parent and child classes have same method and in this case the type of the object determines
which method is to be executed. The type of object is determined at the run time
so this is known as dynamic binding.

This is the same example that we have done in static binding.
The only difference here is that in this example, overriding is actually happening
since these methods are not static, private and final.
In case of overriding the call to the overriden method is determined at runtime by the type
of object thus late binding happens.
Lets see an example to understand this:

 */

class Human {
    //Overridden Method
    public void walk() {
        System.out.println("Human walks");
    }
}

class Demo extends Human {
    //Overriding Method
    public void walk() {
        System.out.println("Boy walks");
    }

    public static void main(String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        Human obj = new Demo();
        /* Reference is of HUman type and object is
         * of Human type.
         */
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();
    }
}

/*
As you can see that the output is different than what we saw in the static binding example,
because in this case while creation of object obj the type of the object is determined as
a Boy type so method of Boy class is called.
Remember the type of the object is determined at the runtime.
 */
