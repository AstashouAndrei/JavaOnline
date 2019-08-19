package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 6.
Сформировать квадратную матрицу вида {{1, 1, ..., 1, 1}, {0, 1, ..., 1, 0}, ... , {0, 1, ..., 1, 0}, {1, 1, ..., 1, 1}}
 */

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Задайте порядок (четное число) матрицы n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка. Задайте порядок (четное число) матрицы n: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n % 2 != 0);

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            if ((n / (i + 1)) >= 2) {
                for (int j = i; j < n - i; j++) {
                    array[i][j] = 1;
                }
            } else {
                for (int j = n - i - 1; j <= i; j++) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Сформированная матрица имеет вид: ");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
        }
    }
}
