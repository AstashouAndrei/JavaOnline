package by.java_online.module_2.multidimensional_array;

import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 15.
Найти наибольший элемент матрицы и заменить все нечетные элементы на него
 */

public class Task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        do {
            System.out.print("Задайте количество (m > 0) строк матрицы: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка. Задайте m (целое число): ");
                scanner.next();
            }
            rows = scanner.nextInt();
        } while (rows < 0);

        int columns;
        do {
            System.out.print("Задайте количество (n > 0) столбцов матрицы: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка. Задайте n (целое число): ");
                scanner.next();
            }
            columns = scanner.nextInt();
        } while (columns < 0);

        int[][] array = new int[rows][columns];

        Random random = new Random();

        System.out.println("Матрица случайных чисел имеет вид:");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int b = 0; b < array[i].length; b++) {
                array[i][b] = random.nextInt(100);
                System.out.print(array[i][b] + " ");
            }
        }

        int maxElement = array[0][0];

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент матрицы: " + maxElement);

        System.out.println("Матрица после замены всех нечетных элементов на максимальный имеет вид: ");
        for (int i = 0; i < array.length; ++i, System.out.println()) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = maxElement;
                }
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
