package Lesson20InnerClass.AnonyomusInnerClass;

/*
It is a type of inner class which
-has no name
-can be instantiated only once
-is usually declared inside a method or a code block ,a curly braces ending with semicolon.
-is accessible only at the point where it is defined.
-does not have a constructor simply because it does not have a name
-cannot be static
 */

class Pizza {
    public void eat() {
        System.out.println("pizza");
    }
}

class Food {
    /* There is no semicolon(;)
     * semicolon is present at the curly braces of the method end.
     */
    Pizza p = new Pizza() {
        public void eat() {
            System.out.println("anonymous pizza");
        }
    };
}
