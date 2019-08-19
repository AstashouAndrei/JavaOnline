package by.java_online.module_1.conditional;

import java.util.Scanner;

/*
Basic of software code development. Ветвления, задание 3.
Определить, лежит ли точка на заданной прямой
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Задайте координату Х точки А: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторите координату Х точки А: ");
            scanner.next();
        }
        int xA = scanner.nextInt();

        System.out.print("Задайте координату Y точки А: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторите координату Y точки А: ");
            scanner.next();
        }
        int yA = scanner.nextInt();


        System.out.print("Задайте координату Х точки B: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторите координату Х точки B: ");
            scanner.next();
        }
        int xB = scanner.nextInt();

        System.out.print("Задайте координату Y точки B: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторите координату Y точки B: ");
            scanner.next();
        }
        int yB = scanner.nextInt();

        System.out.print("Задайте координату Х искомой точки: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторите координату Х искомой точки: ");
            scanner.next();
        }
        int xC = scanner.nextInt();

        System.out.print("Задайте координату Y искомой точки: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Повторите координату Y искомой точки: ");
            scanner.next();
        }
        int yC = scanner.nextInt();

        if ((xA - xB) * (yA - yC) == (xA - xC) * (yA - yB)) {
            System.out.println("Искомая точка лежит на прямой АВ");
        } else {
            System.out.println("Искомая точка не лежит на прямой АВ");
        }
    }
}
