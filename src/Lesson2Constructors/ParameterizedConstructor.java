package Lesson2Constructors;

/*
Constructor with arguments(or you can say parameters) is known as Parameterized constructor.
 */

public class ParameterizedConstructor {
    int studentId;
    String studentName;

    //Parameterized Constructor with two parameters
    //this is comment

    ParameterizedConstructor(int id, String name){
        this.studentId = id;
        this.studentName = name;
    }

    void info(){
        System.out.println("Id: " + studentId + " Name: " + studentName);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(101, "John");
        ParameterizedConstructor obj2 = new ParameterizedConstructor(102, "Jonny");
        obj1.info();
        obj2.info();
    }

}
