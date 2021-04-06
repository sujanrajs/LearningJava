package Lesson12Binding;

class Human{
}
class Boy extends Human{
    public static void main( String args[]) {
        /*This statement simply creates an object of class
         *Boy and assigns a reference of Boy to it*/
        Boy obj1 = new Boy();

        /* Since Boy extends Human class. The object creation
         * can be done in this way. Parent class reference
         * can have child class reference assigned to it
         */
        Human obj2 = new Boy();
    }
}