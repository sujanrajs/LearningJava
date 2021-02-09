package Lesson4Inheritance;

/*

In this example, we have a base class Teacher and a sub class PhysicsTeacher.
Since class PhysicsTeacher extends the designation and college properties and
work() method from base class, we need not to declare these properties and method in sub class.
Here we have collegeName, designation and work() method which are common to all the teachers
so we have declared them in the base class, this way the child classes like
MathTeacher, MusicTeacher and PhysicsTeacher do not need to write this code
and can be used directly from base class.

 */

class ExampleTeacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    void does(){
        System.out.println("Teaching");
    }
}

