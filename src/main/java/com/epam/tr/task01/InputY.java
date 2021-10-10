package com.epam.tr.task01;

import java.util.Scanner;

public class InputY {
    public static int inputY(int y) {
        Scanner str = new Scanner(System.in);
        while (!str.hasNextInt()){
            str.nextLine();
            System.out.println("Введите значение > ");
        }
        str.nextInt();
        return y;
    }
}
