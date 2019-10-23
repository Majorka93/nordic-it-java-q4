package com.zoo.animal;


public class Chiken extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Цып - Цып");
    }

    public void run() {
        System.out.println(getName() + " - Бегать не умеет ");
    }

    public void food() {
        System.out.println(getName() + " - плотоядная и травоядная ");
    }

}