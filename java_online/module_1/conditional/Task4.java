package by.java_online.module_1.conditional;

import java.util.Scanner;

/*
Basic of software code development. Ветвления, задание 4.
Определить возможность прохождения кирпича через прямоугольное отверстие
 */

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину кирпича xB: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину кирпича xB: ");
            scanner.next();
        }
        int xB = scanner.nextInt();

        System.out.print("Введите ширину кирпича yB: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите ширину кирпича yB: ");
            scanner.next();
        }
        int yB = scanner.nextInt();

        System.out.print("Введите высоту кирпича zB: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите высоту кирпича zB: ");
            scanner.next();
        }
        int zB = scanner.nextInt();


        System.out.print("Введите длину отверстия xH: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину отверстия xH: ");
            scanner.next();
        }
        int xH = scanner.nextInt();

        System.out.print("Введите ширину отверстия yH: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите ширину отверстия yH: ");
            scanner.next();
        }
        int yH = scanner.nextInt();

        boolean firstCondition = (xB < xH && xB < yH) || (yB < xH && yB < yH);
        boolean secondCondition = (zB < xH && xB < yH) || (xB < xH && zB < yH);
        boolean thirdCondition = (yB < xH && yB < yH) || (zB < xH && yB < yH);

        if (firstCondition || secondCondition || thirdCondition) {
            System.out.println("Кирпич пройдет через заданное отверстие");
        } else {
            System.out.println("Кирпич не пройдет через заданное отверстие");
        }
    }
}
