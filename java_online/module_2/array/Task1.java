package by.java_online.module_2.array;

import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 1.
Найти сумму элементов массива, кратных К
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину массива: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];

        System.out.print("Введите элемент К: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите элемент К: ");
            scanner.next();
        }
        int divider = scanner.nextInt();

        Random random = new Random();

        System.out.print("Массив случайных чисел: { ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("}");


        int sum = 0;
        for (int x : array) {
            if (x % divider == 0) {
                sum += x;
            }
        }
        System.out.println("Сумма всех элементов массива, кратных " + divider + " составляет: " + sum);
    }
}
