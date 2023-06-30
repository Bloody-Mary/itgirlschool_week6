package ru.babushkina.week6.homework.task1;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        System.out.println("Введите значение вашей температуры целым числом:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i < 0) {
            System.out.println("Сейчас очень холодно.");
        } else if (i >= 0 && i <= 16) {
            System.out.println("Сейчас прохладно.");
        } else {
            System.out.println("Отличный летний день! :)");
        }
    }
}
