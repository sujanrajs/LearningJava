package Lesson5Aggregation.AddressExample2;

public class Staff {
    String employeeName;
    //Creating HAS-A relationship with Address class
    Address employeeAddr;
    Staff(String name, Address addr){
        this.employeeName = name;
        this.employeeAddr = addr;
    }
}
