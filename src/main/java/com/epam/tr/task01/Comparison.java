package com.epam.tr.task01;

public class Comparison {

    public static boolean compare(int cx, int cy) {
        if (cx >= -4 && cx <= 4)
            if (cy <= 0 && cy >= -3)
                return true;

        if (cx >= -2 && cx <= 2)
            return cy >= 0 && cy <= 4;

        return false;
    }
}