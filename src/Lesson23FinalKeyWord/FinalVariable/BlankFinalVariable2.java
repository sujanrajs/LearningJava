package Lesson23FinalKeyWord.FinalVariable;

/*
Whats the use of blank final variable?
Lets say we have a Student class which is having a field called Roll No. Since Roll No should not
be changed once the student is registered, we can declare it as a final variable in a class but we cannot
initialize roll no in advance for allthe students(otherwise all students would be having same roll no).
In such case we can declare roll no variable as blank final and we initialize
this value during object creation like this:
 */

class StudentData {
    //Blank final variable
    final int ROLL_NO;

    StudentData(int rnum) {
        //It must be initialized in constructor
        ROLL_NO = rnum;
    }

    void myMethod() {
        System.out.println("Roll no is:" + ROLL_NO);
    }

    public static void main(String args[]) {
        StudentData obj = new StudentData(1234);
        obj.myMethod();
    }
}
