package Lesson23FinalKeyWord.FinalVariable;

// For a final reference variable you cannot change what object it refers to.
// You can, however, modify the object itself.

class Reference{
    public int value = 5;
}

class frVariable {
    public static void FinalReference( String args[] ) {

        final Reference example = new Reference(); //declaration
        example.value = 6; // Modifying the object creates no disturbance

        Reference another = new Reference();
        // example = another; // Attempting to change the object it refers to, creates an error

    }
}
