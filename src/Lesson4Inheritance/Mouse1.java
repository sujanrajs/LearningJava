package Lesson4Inheritance;

public class Mouse1 extends Mouse{
    String texture = "Matte";

    public static void leftClick() {
        System.out.println("Left Click!");
    }

    public static void rightClick() {
        System.out.println("Right Click!");
    }

    public static void setColor(String color) {
        System.out.println(color);
    }
}
