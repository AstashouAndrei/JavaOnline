package by.java_online.module_2.array;

import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 3.
Подсчитать кол-во отрицательных, положительных и нулевых элементов в массиве действительных чисел
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка. Введите размерность массива: ");
            scanner.next();
        }
        double[] array = new double[scanner.nextInt()];

        System.out.print("Введите начало диапазона случайных чисел: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка. Введите начало диапазона случайных чисел: ");
            scanner.next();
        }
        double startWith = scanner.nextInt();

        System.out.print("Введите конец диапазона случайных чисел: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка. Введите конец диапазона случайных чисел: ");
            scanner.next();
        }
        double endWith = scanner.nextInt();

        int positive = 0;
        int zero = 0;

        System.out.print("Массив случайных чисел из заданного диапазона: { ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * (endWith - startWith + 1) + startWith);
            System.out.printf("%.2f ", array[i]);
            if (array[i] == 0) {
                zero++;
            } else if (array[i] > 0) {
                positive++;
            }
        }
        System.out.println("}");

        System.out.println("Положительных элементов: " + positive);
        System.out.println("Отрицательных элементов: " + (array.length - positive - zero));
        System.out.println("Нулевых элементов: " + zero);
    }
}
