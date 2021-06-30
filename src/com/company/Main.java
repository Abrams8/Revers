package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        revers(number);
    }

    public static void revers(int value) {
        String str = Integer.toString(value);
        char[] number = str.toCharArray();
        int i = 0;
        int l = number.length - 1;
        for (i = 0, l = number.length - 1; i < number.length && i - l != 1 && i != l; i++, l--) {
            char leftNumber = number[i];
            char rightNumber = number[l];
            char newRightNumber = leftNumber;
            char newLeftNumber = rightNumber;
            number[i] = newLeftNumber;
            number[l] = newRightNumber;
        }
        System.out.print("Перевернутое число: ");
        for (int p = 0; p < number.length; p++) {
            System.out.print(number[p]);
        }
    }
}
