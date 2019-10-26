package com.zoo.animal;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say();


    public void breatheAir() {
        System.out.println(getName() + " - дышит воздухом");
    }

    public abstract void run();


    public void eat() {
        System.out.println(getName() + " - Необходима еда");
    }

    public abstract void food();


}