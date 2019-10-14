package com.company;

import java.util.Scanner;

public class HomeWorkLesson7 {
    public static void main(String[] args) {
        //Факториал используя рекурсию

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String text = scanner.next();
        while (!text.equals("q")) {
            n = Integer.parseInt(text);
            if (isValidNumber(n)) {
                System.out.println(n + "! =" + factorial(n));
            }
            System.out.println("Введите новое число или введите 'q' для выхода");
            text = scanner.next();
        }
    }

    private static boolean isValidNumber(int n) {
        if (n < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (n > 15) {
            System.out.println("Вы ввели очень большое число");
        } else {
            return true;
        }
        return false;
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}

