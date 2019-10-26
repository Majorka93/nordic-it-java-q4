package com.zoo.animal;



public class Woodpecker extends Animal {

    public void say() {
        System.out.println(getName() + " делает: " + " Тук-Тук");
    }

    public void run() {
        System.out.println(getName() + " - Не бегает, но летает ");
    }

    public void food() {
        System.out.println(getName() + " - плотоядный ");
    }

}