package by.java_online.module_1.linear;

import java.util.Scanner;

/*
Basic of software code development. Линейные программы, задание 1.
Найти значение функции (b+sqrt(b^2+4*a*c))/(2*a) - a^3*c+ b^-2
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Повторно введите а:");
            scanner.next();
        }
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Повторно введите b:");
            scanner.next();
        }
        double b = scanner.nextDouble();

        System.out.print("Введите c: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Повторно введите c:");
            scanner.next();
        }
        double c = scanner.nextDouble();


        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * c * a)) / 2 + Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Результат вычисления функции: " + result);
    }
}
