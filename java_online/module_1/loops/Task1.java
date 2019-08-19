package by.java_online.module_1.loops;

import java.util.Scanner;

/*
Basic of software code development. Циклы, задание 1.
Определить сумму чисел от 1 до введенного числа
*/

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение Х: ");
        while (!scanner.hasNext()) {
            System.out.print("Ошибка. Введите значение Х: ");
            scanner.next();
        }
        int x = scanner.nextInt();

        // Решение 1
        System.out.println("Сумма всех чисел от 1 до Х составляет: " + (x * (x + 1) / 2));

        // Решение 2
        int result = 0;
        for (int i = 0; i <= x; i++) {
            result += i;
        }

        System.out.println("Сумма всех чисел от 1 до Х составляет: " + result);
    }
}
