package com.zoo.animal;


public class Toad extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Ква-Ква ");
    }

    public void run() {
        System.out.println(getName() + " - Не бегает, но прыгает ");
    }

    public void food() {
        System.out.println(getName() + " - плотоядная ");
    }


}