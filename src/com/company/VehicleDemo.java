package com.company;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }


    int range() {
        return this.fuelcap * this.mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles / this.mpg;
    }

    int getPassengers() { return passengers; }
    void setPassengers(int passengers) { this.passengers = passengers; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int fuelcap) { this.fuelcap = fuelcap; }
    int getMpg() { return mpg; }
    void setMpg(int mpg) { this.mpg = mpg; }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int passengers, int fuelcap, int mpg, int cargocap) {
        super(passengers, fuelcap, mpg);

        this.cargocap = cargocap;
    }

    int getCargocap() { return cargocap; }
    void setCargocap(int cargocap) { this.cargocap = cargocap; }
}


public class VehicleDemo {
    public static void main(String args[]) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can in " + semi.getCargocap() + " founts");

        System.out.println("For ride " + dist + " miles need " + gallons + " gallons fuel");

        gallons = pickup.fuelneeded(dist);

        System.out.println("pickup can in " + pickup.getCargocap() + " founts");

        System.out.println("For ride " + dist + " miles need " + gallons + " gallons fuel");

    }
}
