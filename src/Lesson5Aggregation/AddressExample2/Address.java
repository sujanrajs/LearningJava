package Lesson5Aggregation.AddressExample2;

/*
To maintain code re-usability. To understand this lets take the same example again.
Suppose there are two other classes College and Staff along with above two classes Student and Address.
In order to maintain Student’s address, College Address and Staff’s address
we don’t need to use the same code again and again. We just have to use the reference of Address class
while defining each of these classes like:

Student Has-A Address (Has-a relationship between student and address)
College Has-A Address (Has-a relationship between college and address)
Staff Has-A Address (Has-a relationship between staff and address)
Hence we can improve code re-usability by using Aggregation relationship.

We didn’t write the Address code in any of the three classes,
we simply created the HAS-A relationship with the Address class to use the Address code.
 */

public class Address {
    int streetNum;
    String city;
    String state;
    String country;
    Address(int street, String c, String st, String coun)
    {
        this.streetNum=street;
        this.city =c;
        this.state = st;
        this.country = coun;
    }
}
