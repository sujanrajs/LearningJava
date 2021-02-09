package Lesson4Inheritance;

public class ChefInheritance extends Chef{

    // This class(child class) can copy(inherit) all the methods from Chef class(parent class)

    public void myOwnDish(){
        System.out.println("The chef makes my Own Dish too //Can include new methods too");
    }

    @Override
    public void makeSpecialDish(){
        System.out.println("The chef makes MoMo as special dish //This is override");
    }
}
