package Lesson5Aggregation.Address;

public class StudentClass
{
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with Address class
    Address studentAddr;
    StudentClass(int roll, String name, Address addr){
        this.rollNum=roll;
        this.studentName=name;
        this.studentAddr = addr;
    }
    public static void main(String args[]){
        Address ad = new Address(93, "Helsinki", "Katu", "Finland");
        StudentClass obj = new StudentClass(123, "Mike", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}
