package com.zoo.animal;


public class Cow extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Муууу");
    }

    public void run() {
        System.out.println(getName() + " - умеет бегать! ");
    }

    public void food() {
        System.out.println(getName() + " - травоядная ");
    }

}