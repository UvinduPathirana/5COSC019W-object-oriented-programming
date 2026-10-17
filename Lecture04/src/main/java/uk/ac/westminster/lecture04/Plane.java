package uk.ac.westminster.lecture04;

public class Plane extends Vehicle {
    private int wings;

    public Plane(String vehicleID, String make, int topSpeed, int capacity, int wings, String transmission) {
        super(vehicleID, make, topSpeed, capacity, wings, transmission);
        this.wings = wings;
    }
    
    public int getWings() {
        return wings;
    }
}   