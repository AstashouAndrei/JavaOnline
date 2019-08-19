package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 14.
Сформировать m x n матрицу, состоящую из 0 и 1. Кол-во 1 в столбце = номеру столбца.
 */

public class Task14 {

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

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                array[i][j] = 1;
            }
        }
        System.out.println("Сформированная матрица имеет вид: ");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
