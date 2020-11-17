package Lesson1JavaFoundation;

/*
This is without parameters and arguments
public class ParametersVsArguments {
    public static void hello() { //This hello Function have zero parameters
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        hello(); //hello function is called here in main
    }
}
 */

public class ParametersVsArguments {
    public static void hello(String name, String anotherName) { //name is our parameter
        System.out.println("Hi " + name + " and " + anotherName);
    }

    public static void main(String[] args) {
        hello("Sujan", "Raj"); // Sujan and Raj is an argument that is value for name
        hello("Helsinki", "Turku");
    }
}

