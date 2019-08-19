package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 5.
Сформировать квадратную матрицу вида {{1, 1, ..., 1, 1}, {2, 2, ..., 2, 0}, {n-1, n-1, 0, ... , 0}, {n, 0, 0, ..., 0}}
 */
public class Task5 {

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
            for (int j = 0; j < n - i; j++) {
                array[i][j] = i + 1;
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
