package com.company;

import java.util.Scanner;

public class SegmentsIntersection {
    public static void main(String[] args) {
        double x1, x2, x3, x4, y1, y2, y3, y4, d, d1, d2, k1, k2;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите x1: ");
        x1 = in.nextDouble();
        System.out.print("Введите y1: ");
        y1 = in.nextDouble();
        System.out.print("Введите x2: ");
        x2 = in.nextDouble();
        System.out.print("Введите y2: ");
        y2 = in.nextDouble();
        System.out.print("Введите x3: ");
        x3 = in.nextDouble();
        System.out.print("Введите y3: ");
        y3 = in.nextDouble();
        System.out.print("Введите x4: ");
        x4 = in.nextDouble();
        System.out.print("Введите y4: ");
        y4 = in.nextDouble();

        d = (x1 - x2) * (y4 - y3) - (y1 - y2) * (x4 - x3);
        d1 = (x1 - x3) * (y4 - y3) - (y1 - y3) * (x4 - x3);
        d2 = (x1 - x2) * (y1 - y3) - (y1 - y2) * (x1 - x3);

        if (d == 0) {
            System.out.print("Отрезки лежат на паралельных прямых");
        } else {
            k1 = d1 / d;
            k2 = d2 / d;
            if (k1 >= 0 && k1 <= 1 && k2 >= 0 && k2 <= 1) {
                System.out.print("Отрезки пересекаются");
            } else {
                System.out.print("Отрезки не пересекаются");
            }
        }
    }
}

