package by.java_online.module_1.loops;

import java.util.Scanner;

/*
Basic of software code development. Циклы, задание 2.
Вычислить значение ф-ии на отрезке [a,b] с шагом h:  y = x, если x >2,   y = - x, если x<=2
*/

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Задайте начало отрезка a: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Задайте начало отрезка а: ");
            scanner.next();
        }
        int a = scanner.nextInt();

        System.out.print("Задайте конец отрезка b: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Задайте конец отрезка b: ");
            scanner.next();
        }
        int b = scanner.nextInt();

        System.out.print("Задайте шаг h: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Задайте шаг h: ");
            scanner.next();
        }
        int h = scanner.nextInt();

        int valueX = a;
        int valueY;

        while (valueX <= b) {
            if (valueX > 2) {
                valueY = valueX;
            } else {
                valueY = -valueX;
            }
            System.out.println("При х=" + valueX + " y=" + valueY);
            valueX += h;
        }
    }
}
