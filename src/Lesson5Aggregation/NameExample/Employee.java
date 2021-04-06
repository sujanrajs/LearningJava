package Lesson5Aggregation.NameExample;

public class Employee {
    int age;
    Name n;
    public void display(int age, Name n){
        System.out.println("Age: "+age);
        System.out.println("First_Name: "+n.FirstName+" "+"Middle_Name:"+n.MiddleName+" "+"LastName:"+n.LastName);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        Name n = new Name("Mikko", "Raj", "Karki");
        e.display(50, n);
    }
}
