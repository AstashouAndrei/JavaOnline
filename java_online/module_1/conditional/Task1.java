package by.java_online.module_1.conditional;

import java.util.Scanner;

/*
Basic of software code development. Ветвления, задание 1.
Определение существование треугольника по двум заданным углам
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите угол А треугольника: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите угол А треугольника: ");
            scanner.next();
        }
        int firstAngle = scanner.nextInt();

        while (true) {
            if (firstAngle > 0 && firstAngle < 180) {
                break;
            } else {
                System.out.print("Недопустимое значение. Введите угол А треугольника: ");
                firstAngle = scanner.nextInt();
            }
        }

        System.out.print("Введите угол В треугольника: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите угол B треугольника: ");
            scanner.next();
        }
        int secondAngle = scanner.nextInt();

        while (true) {
            if (secondAngle > 0 && secondAngle < 180) {
                break;
            } else {
                System.out.print("Недопустимое значение. Введите угол B треугольника: ");
                secondAngle = scanner.nextInt();
            }
        }

        if ((firstAngle + secondAngle) >= 180) {
            System.out.println("Трегульник с заданными углами не существует");
        } else if ((firstAngle + secondAngle) == 90) {
            System.out.println("Трегульник существует и является прямоугольным");
        } else {
            System.out.println("Трегульник с заданными углами существует");
        }
    }
}
