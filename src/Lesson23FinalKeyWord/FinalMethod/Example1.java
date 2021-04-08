package Lesson23FinalKeyWord.FinalMethod;

// A method, declared with the final keyword, can not be overridden or hidden by subclasses.

// declaring a final method
class Base {

    public final void finalMethod() {
        System.out.print("Base");
    }

}

/*
class Derived extends Base {
    public final void finalMethod() { //Overriding the final method throws an error
        System.out.print("Derived");
    }
}

 */
