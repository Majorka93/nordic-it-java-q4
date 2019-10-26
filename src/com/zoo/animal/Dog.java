package com.zoo.animal;



public class Dog extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Гав - Гав ");
    }

    public void run() {
        System.out.println(getName() + " - умеет бегать! ");
    }

    public void food() {
        System.out.println(getName() + " - плотоядный ");
    }

}
