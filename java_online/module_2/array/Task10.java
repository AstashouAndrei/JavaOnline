package by.java_online.module_2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 10.
Сжать массив, выбросив каждый второй элемент (освободившиеся заполнить нулями).
 */

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите количество элементов массива: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(42);
        }
        System.out.println("Массив до сжатия: " + Arrays.toString(array));

        System.out.print("Массив после сжатия: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
