package Lesson23FinalKeyWord.FinalMethod;

// This program would run fine as we are not overriding the final method.
// That shows that final methods are inherited but they are not eligible for overriding.

class WXYZ{
    final void demo(){
        System.out.println("XYZ Class Method");
    }
}

class ABC extends WXYZ{
    public static void main(String args[]){
        ABC obj= new ABC();
        obj.demo();
    }
}

