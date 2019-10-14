package com.company;

import java.util.Scanner;

public class HomeWorkLesson5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введите диапозон от 0 до ...");
        var n = scanner.nextInt();
        var sum = 0;
        var number = 0;
        for (var i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                number++;
                sum += i;
            }
        }

        System.out.println("Сумма четных чисел: " + sum);
        System.out.println("Количество четных чисел: " + number);

    }
}

