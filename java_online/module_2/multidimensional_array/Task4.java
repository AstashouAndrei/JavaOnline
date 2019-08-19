package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 4.
Сформировать квадратную матрицу вида { {1,2,3,..n}, {n, n-1, n-2,..1}, {1,2,3,..n}, ..., {n, n-1, n-2,..1}  }
 */

public class Task4 {

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
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = n - j;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = j + 1;
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
