package com.epam.tr.task01;

public class Main {

    public static void main(String[] args) {
        boolean check = Comparison.compare(Input.inputX(), Input.inputY());
        Print switched = new Print();
        switched.print(check);
    }

}