package by.java_online.module_2.multidimensional_array;

import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 12.
Отсортировать строки матрицы по возрастанию и убыванию элементов
 */

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Задайте количество (m) строк матрицы: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Задайте количество (m) строк матрицы: ");
            scanner.next();
        }
        int rows = scanner.nextInt();

        System.out.print("Задайте количество (n) столбцов матрицы: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Задайте количество (n) столбцов матрицы: ");
            scanner.next();
        }
        int columns = scanner.nextInt();


        int[][] array = new int[rows][columns];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                array[i][b] = random.nextInt(50);
            }
        }

        System.out.println("Матрица случайных чисел имеет вид:");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int b = 0; b < array[i].length; b++) {
                System.out.print(array[i][b] + " ");
            }
        }

        int maxElement;

        System.out.println("Матрица после сортировки строк по убыванию: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                maxElement = array[i][j];
                for (int k = j + 1; k < array[i].length; k++) {
                    if (array[i][k] > maxElement) {
                        maxElement = array[i][k];
                        int temp = array[i][j];
                        array[i][j] = maxElement;
                        array[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int b = 0; b < array[i].length; b++) {
                System.out.print(array[i][b] + " ");
            }
        }

        System.out.println("Матрица после сортировки строк по возрастанию: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                maxElement = array[i][j];
                for (int k = j + 1; k < array[i].length; k++) {
                    if (array[i][k] < maxElement) {
                        maxElement = array[i][k];
                        int temp = array[i][j];
                        array[i][j] = maxElement;
                        array[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int b = 0; b < array[i].length; b++) {
                System.out.print(array[i][b] + " ");
            }
        }
    }
}
