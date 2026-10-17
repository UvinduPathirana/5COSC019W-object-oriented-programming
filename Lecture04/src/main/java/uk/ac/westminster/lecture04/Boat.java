package uk.ac.westminster.lecture04;

public class Boat extends Vehicle {
    private int length;

    public Boat(String vehicleID, String make, int topSpeed, int capacity, int length, String transmission) {
        super(vehicleID, make, topSpeed, capacity, length, transmission);
        this.length = length;
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}   