package com.company;

public class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Eat everything");
    }

    @Override
    public void breathe() {
        System.out.println("breathe normally");
    }

    @Override
    public void fly() {
        System.out.println("Yesss! I can fly");
    }

}
