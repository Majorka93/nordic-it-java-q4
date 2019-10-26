package com.zoo.animal;


public class Cat extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Мяу - Мяу");
    }

    public void run() {
        System.out.println(getName() + " - умеет бегать! ");
    }

    public void food() {
        System.out.println(getName() + " - плотоядная ");
    }


}