package Lesson3StaticKeyWord;

// We can access static methods anywhere we want we do not have to create instances of that class

public class StaticMathMethodExample {
    public static void main(String[] args) {
        // Math myMath = new Math(); We do not need to do this way
        // Math class is storing static method
        // We can do same example in another class called StaticMathMethod
        System.out.println(Math.max(2, 6));

        System.out.println("-------------------------------");

        StaticMathMethod.maxMethod();
        // This static method is made by me but
        // Math.max static method is already inbuilt in Java so we can directly access it.



    }
}
