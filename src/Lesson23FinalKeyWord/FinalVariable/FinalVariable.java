package Lesson23FinalKeyWord.FinalVariable;

/*
If a variable is declared with the final keyword, its value cannot be changed once initialized.
Note that the variable does not necessarily have to be initialized at the time of declaration.
If it’s declared but not yet initialized, it’s called a blank final variable.

final variables are nothing but constants.
We cannot change the value of a final variable once it is initialized.
 */

// declaring a final variable
class FinalVariable {

    final int var = 50;

    // var = 60 //This line would give an error

}



/*
class Demo{

    final int MAX_VALUE=99;
    void myMethod(){
        MAX_VALUE=101;
    }
    public static void main(String args[]){
        Demo obj=new  Demo();
        obj.myMethod();
    }
}
*/

// We got a compilation error in the above program because we tried to change the value of a final variable “MAX_VALUE”.
//Note: It is considered as a good practice to have constant names in UPPER CASE(CAPS).