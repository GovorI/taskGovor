package com.company;

import java.util.Scanner;

public class SimpleNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int[] numbers = new int[num + 1];

        for (int i = 0; i < num; i++) {
            numbers[i] = i;
        }

        numbers[1] = 0;

        for (int i = 2; i < num; i++) {
            if (numbers[i] != 0) {
                for (int w = i * 2; w < num; w += i) {
                    numbers[w] = 0;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " | ");
            }
        }
    }
}
