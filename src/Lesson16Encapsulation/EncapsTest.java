package Lesson16Encapsulation;

/*
How to implement encapsulation in java:
1) Make the instance variables private so that they cannot be accessed directly from outside the class.
You can only set and get values of these variables through the methods of the class.
2) Have getter and setter methods in the class to set and get the values of the fields.
*/

class EncapsulationDemo {
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN() {
        return ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
    }

    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public void setEmpSSN(int newValue) {
        ssn = newValue;
    }
}

public class EncapsTest {
    public static void main(String args[]) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}

/*
In above example all the three data members (or data fields) are private(Access Modifiers in Java)
which cannot be accessed directly.
These fields can be accessed via public methods only.
Fields empName, ssn and empAge are made hidden data fields using encapsulation technique of OOPs.
 */