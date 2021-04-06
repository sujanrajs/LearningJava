package Lesson5Aggregation.AddressExample2;

public class College {
    String collegeName;
    //Creating HAS-A relationship with Address class
    Address collegeAddr;
    College(String name, Address addr){
        this.collegeName = name;
        this.collegeAddr = addr;
    }
}
