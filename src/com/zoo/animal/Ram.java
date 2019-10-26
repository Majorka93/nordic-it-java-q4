package com.zoo.animal;


public class Ram extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Бее ");
    }

    public void run() {
        System.out.println(getName() + " - умеет бегать! ");
    }

    public void food() {
        System.out.println(getName() + " - травоядный ");
    }

}