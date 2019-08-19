package by.java_online.module_1.conditional;

import java.util.Scanner;

/*
Basic of software code development. Ветвления, задание 2.
Вычислить max(min(a,b), min(c,d)
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите а: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите целое а: ");
            scanner.next();
        }
        int a = scanner.nextInt();

        System.out.print("Введите b: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите целое b: ");
            scanner.next();
        }
        int b = scanner.nextInt();

        System.out.print("Введите c: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите целое c: ");
            scanner.next();
        }
        int c = scanner.nextInt();

        System.out.print("Введите d: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите целое d: ");
            scanner.next();
        }
        int d = scanner.nextInt();

        int result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Результат вычисления max(min(a,b), min(c,d): " + result);
    }
}
