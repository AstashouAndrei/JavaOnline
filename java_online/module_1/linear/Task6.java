package by.java_online.module_1.linear;

import java.util.Scanner;

/*
Basic of software code development. Линейные программы, задание 6.
"Определить принадлежность точки к заданной области"
 */

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату по оси Х: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите координату по оси Х: ");
            scanner.next();
        }
        int x = scanner.nextInt();

        System.out.print("Введите координату по оси Y: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите координату по оси Y: ");
            scanner.next();
        }
        int y = scanner.nextInt();

        boolean firstCondition = (x >= -2 && x <= 2) && (y >= 0 && y <= 4);
        boolean secondCondition = (x >= -4 && x <= 4) && (y >= -3 && y <= 0);

        if (firstCondition || secondCondition) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
