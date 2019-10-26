package com.zoo;

import com.zoo.animal.*;

public class Zoo {

    public static void main(String[] args) {

        var cat = new Cat();
        cat.setName("Гав");
        System.out.println("Кошку зовут: " + cat.getName());
        cat.say();
        cat.breatheAir();
        cat.run();
        cat.eat();
        cat.food();


        var cow = new Cow();
        cow.setName("Буренка");
        System.out.println("Корову зовут: " + cow.getName());
        cow.say();
        cow.breatheAir();
        cow.run();
        cow.eat();
        cow.food();


        var dog = new Dog();
        dog.setName("Шарик");
        System.out.println("Собаку зовут: "  + dog.getName());
        dog.say();
        dog.breatheAir();
        dog.run();
        dog.eat();
        dog.food();


        var ram = new Ram();
        ram.setName("Иннокентий");
        System.out.println("Барана зовут: " + ram.getName());
        ram.say();
        ram.breatheAir();
        ram.run();
        ram.eat();
        ram.food();


        var toad = new Toad();
        toad.setName("Клава");
        System.out.println("Жабу зовут: " + toad.getName());
        toad.say();
        toad.breatheAir();
        toad.run();
        toad.eat();
        toad.food();


        var woodi = new Woodpecker();
        woodi.setName("Вуди");
        System.out.println("Дятла зовут: " + woodi.getName());
        woodi.say();
        woodi.breatheAir();
        woodi.run();
        woodi.eat();
        woodi.food();


        var chiken = new Chiken();
        chiken.setName("Цыпа");
        System.out.println("Курицу зовут: " + chiken.getName());
        chiken.say();
        chiken.breatheAir();
        chiken.run();
        chiken.eat();
        chiken.food();

    }

}