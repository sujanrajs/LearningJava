package Lesson10OverLoadingVSOverRiding;

//Here speedLimit() method of class Ford is overriding the speedLimit() method of class OverRidingCar.

class OverRidingCar {
    public int speedLimit() {
        return 100;
    }
}

class Ford extends OverRidingCar {
    public int speedLimit() {
        return 150;
    }

    public static void main(String args[]) {
        OverRidingCar obj = new Ford();
        int num = obj.speedLimit();
        System.out.println("Speed Limit is: " + num);
    }
}
