package uk.ac.westminster.lecture04;

public class Car extends Vehicle {
    private int doors;

    public Car(String vehicleID, String make, int topSpeed, int capacity, int doors, String transmission) {
        super(vehicleID, make, topSpeed, capacity, doors, transmission);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
    
    public void setDoors(int doors) {
        this.doors = doors;
    }
}