package com.company;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        for (int i = 1; i <= num; i++) {
            if (fibonacci(i) <= num) {
                numbers[i] = fibonacci(i);
                System.out.print(numbers[i] + " | ");
            }
        }

    }
    public static int fibonacci(int num)  {
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
    }


}
