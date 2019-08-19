package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 3.
Вывести k-ю строку и p-й столбец матрицы
 */

public class Task3 {

    public static void main(String[] args) {

        int[][] array = {{10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
                {50, 51, 52, 53, 54}};

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите номер искомой строки: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите номер искомой строки: ");
            scanner.next();
        }
        int k = scanner.nextInt();

        System.out.print("Искомая строка #" + k + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[k][i] + " ");
        }
        System.out.println();


        System.out.print("Введите номер искомого столбца: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите номер искомого столбца: ");
            scanner.next();
        }
        int p = scanner.nextInt();

        System.out.print("Искомый столбец #" + p + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][p] + " ");
        }
    }
}
