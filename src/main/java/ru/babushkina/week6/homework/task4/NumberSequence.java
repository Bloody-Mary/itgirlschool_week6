package ru.babushkina.week6.homework.task4;

public class NumberSequence {
    public static void main(String[] args) {
        int num1 = 1;
        while (num1 <= 512) {
            System.out.println(num1);
            num1 = num1 * 2;
        }

        System.out.println("");

        int num2 = 1;
        do {
            System.out.println(num2);
            num2 = num2 * 2;
        } while (num2 <= 512);
    }
}
