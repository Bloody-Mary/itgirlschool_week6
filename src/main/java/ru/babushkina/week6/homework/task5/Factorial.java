package ru.babushkina.week6.homework.task5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner inputInt = new Scanner(System.in);
        int f = inputInt.nextInt();
        int result = 1;

        for (int i = 1; i <= f; i++) {
            result = result * i;
            System.out.println(result);
        }

        System.out.println("Факториал числе " + f + " равен " + result);
    }
}
