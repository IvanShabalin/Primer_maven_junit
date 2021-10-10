package com.epam.tr.task01;

import java.util.Scanner;

public class Input {

    static public int inputX() {
        System.out.println("Введите значение X");
        Scanner str = new Scanner(System.in);
        while (!str.hasNextInt()) {
            str.nextLine();
            System.out.println("Введите значение > ");
        }
        return str.nextInt();
    }

    static public int inputY() {
        System.out.println("Введите значение Y");
        Scanner str = new Scanner(System.in);
        while (!str.hasNextInt()) {
            str.nextLine();
            System.out.println("Введите значение > ");
        }
        return str.nextInt();
    }
}