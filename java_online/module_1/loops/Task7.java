package by.java_online.module_1.loops;

import java.util.Scanner;

/*
Basic of software code development. Циклы, задание 7.
Вывести все делители каждого числа из заданного промежутка кроме единицы и самого числа
 */

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение начала промежутка m: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите значение начала промежутка m: ");
            scanner.next();
        }
        int begin = scanner.nextInt();

        System.out.print("Введите значение конца промежутка n: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите значение конца промежутка n: ");
            scanner.next();
        }
        int end = scanner.nextInt();

        System.out.println("Числа, входящие в промежуток от " + begin +
                " до " + end + ", не включая 1 и само число, имеют следующие делители:");

        for (int i = begin; begin < end; begin++, System.out.println()) {
            System.out.print("Делители числа " + begin + ": ");
            for (int j = 2; j < begin; j++) {
                int res = begin % j;
                if (res == 0) {
                    System.out.print(begin / j + " ");
                }
            }
        }
    }
}
