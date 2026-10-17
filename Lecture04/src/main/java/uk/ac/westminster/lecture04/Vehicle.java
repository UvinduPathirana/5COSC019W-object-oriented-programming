package uk.ac.westminster.lecture04;

public class Vehicle {
    private String vehicleID;
    private String make;
    private int topSpeed;
    private int capacity;
    private int doors;
    private String transmission;

    public Vehicle(String vehicleID, String make, int topSpeed, int capacity, int doors, String transmission) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
        this.doors = doors;
        this.transmission = transmission;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getMake() {
        return make;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDoors() {
        return doors;
    }
    
    public String getTransmission() {
        return transmission;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}