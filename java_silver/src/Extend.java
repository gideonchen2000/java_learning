public class Extend {
    public static void main(String[] args) {
        Car c1 = new Car("auto");
        Car c2 = new Car("4w", 150, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    Vehicle(){}
}

class Car extends Vehicle {
    String trans;

    Car(String trans) {
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this.trans = trans;
    }
}
