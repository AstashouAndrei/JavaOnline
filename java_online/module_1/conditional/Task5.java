package by.java_online.module_1.conditional;

import java.util.Scanner;
/*
Basic of software code development. Ветвления, задание 5.
Вычислить:  x^2 - 3 * x + 9, если x <=3,   1 / (х ^ 3 + 6),   если х > 3
 */
public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Введите значение х: ");
            scanner.next();
        }
        double x = scanner.nextDouble();

        System.out.println(x > 3 ? "Значение функции F(x)=" + (Math.pow(x,2) - 3*x + 9) : "Значение функции F(x)=" + 1 /  (Math.pow(x,3) + 6));
    }
}