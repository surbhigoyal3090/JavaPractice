package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Change to " + this.currentGear + " gear.");
    }

    public String changeVelocity(int speed, String direction) {
        move(speed,direction);
        System.out.println("Velocity is " + speed + " and direction is " + direction);
        return direction;
    }

}
