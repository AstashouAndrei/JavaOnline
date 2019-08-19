package by.java_online.module_1.linear;

import java.util.Scanner;

/*
Basic of software code development. Линейные программы, задание 2.
Найти значение функции z = ((a-3)*b/2) + c
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторно введите a: ");
            scanner.next();
        }
        int a = scanner.nextInt();

        System.out.print("Введите b: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторно введите b: ");
            scanner.next();
        }
        int b = scanner.nextInt();

        System.out.print("Ошибка. Повторно введите c: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Введите c: ");
            scanner.next();
        }
        int c = scanner.nextInt();

        int z = ((a - 3) * b / 2) + c;

        System.out.println("Результат вычисления функции z: " + z);
    }
}
