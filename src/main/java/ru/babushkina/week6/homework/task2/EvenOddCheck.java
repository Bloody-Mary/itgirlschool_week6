package ru.babushkina.week6.homework.task2;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner inputNum = new Scanner(System.in);
        int number = inputNum.nextInt();

        String result = (number % 2 == 0) ? "Число чётное" : "Число нечётное";
        System.out.println(result);
    }
}
