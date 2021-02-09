package Lesson4Inheritance;

public class PhysicsTeacher extends ExampleTeacher{
    String mainSubject = "Physics";

    public static void main(String args[]){
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
