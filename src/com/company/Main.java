package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int num = scanner.nextInt();
        int[] mass = new int[num];
        for (int i = 0; i < num; i++) {
            mass[i] = i;
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Какое число нужно найти?");
        int value;
        value = scanner.nextInt();
        boolean resultOk = false;
        int position = -1, last = num-1, first = 0, middle;

        while (first <= last) {
            middle = (first+last)/2;
            System.out.println(00);
            if (value == mass[middle]) {
                resultOk = true;
                position = middle;
                System.out.println(1);
                break;
            } else if (value > mass[middle]) {
                first = middle + 1;
                //last = middle - 1;
                System.out.println(2);
            } else if (value < mass[middle]){
                //first = middle - 1;
                last = middle - 1;
                System.out.println(3);
            }
        }

        if (resultOk) {
            System.out.println("Элемент найден на позиции " + position);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
