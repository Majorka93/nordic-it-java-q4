package com.company;

import java.util.ArrayList;

public class HomeWorkLesson7Fibonachi {
    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>(30);
        for (var i = 0; i < 30; i++) {
            if (i <= 1) {
                arrayList.add(i);
            } else {
                arrayList.add(arrayList.get(i - 1) + arrayList.get(i - 2));
            }
        }
        System.out.println(arrayList);


    }
}
