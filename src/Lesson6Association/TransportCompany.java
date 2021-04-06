package Lesson6Association;

/*
There is a one to one relationship(Association) between two classes: CarClass and Driver.
Both the classes represent two separate entities.
 */


class CarClass{
    String carName;
    int carId;
    CarClass(String name, int id)
    {
        this.carName = name;
        this.carId = id;
    }
}
class Driver extends CarClass{
    String driverName;
    Driver(String name, String cname, int cid){
        super(cname, cid);
        this.driverName=name;
    }
}
class TransportCompany{
    public static void main(String args[])
    {
        Driver obj = new Driver("Andy", "Mazda", 12345);
        System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
    }
}