package by.java_online.module_1.linear;

import java.util.Scanner;

/*
Basic of software code development. Линейные программы, задание 3.
Найти значение функции ( (sin x + cos y) / (cos x - sin y) ) * tg x * y
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Повторно введите х: ");
            scanner.next();
        }
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Повторно введите y: ");
            scanner.next();
        }
        double y = scanner.nextDouble();

        double result = (Math.sin(x) + Math.cos(y)) / (Math.sin(x) + Math.cos(y)) * Math.tan(x * y);
        System.out.println("Результат вычисления функции: " + result);
    }
}

