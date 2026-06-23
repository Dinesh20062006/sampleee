package Day_4;

abstract class Vehicle {
    abstract void start();
    void displayVehicleType() {
        System.out.println("This is a Vehicle");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self-start or kick-start.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a push-button or key ignition.");
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.displayVehicleType();
        bike.start();

        System.out.println();

        Car car = new Car();
        car.displayVehicleType();
        car.start();
    }
}