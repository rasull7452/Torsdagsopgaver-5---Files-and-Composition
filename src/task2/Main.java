package task2;

import java.util.ArrayList;

// 2.b
public class Main {
    public static void main(String[] args) {
        // 2.g
        Cafe c1 = new Cafe();

        c1.loadMenuData();

        // 2.h
        for (String c : c1.getCoffeeMenu()) {

            System.out.println(c);

        }
    }
}

