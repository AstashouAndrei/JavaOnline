package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 7.
Сформировать квадратную матрицу порядка N по правилу A [I, J] = sin ( (I^2 - J^2) / N ), подсчитать кол-во положит. эл-ов
 */

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте порядок матрицы n: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка. Задайте порядок матрицы n: ");
            scanner.next();
        }
        int n = scanner.nextInt();

        double[][] array = new double[n][n];

        int posCounter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (array[i][j] > 0) {
                    posCounter++;
                }
            }
        }

        System.out.println("Сформированная матрица имеет вид: ");

        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.2f   ", array[i][j]);
            }
        }

        System.out.println("Количество положительных элементов в " +
                "сформированной матрице: " + posCounter);
    }
}
