package by.java_online.module_2.multidimensional_array;

import java.util.Scanner;

/*
2. Algorithmization. Массивы массивов, задание 8.
Поменять местами столбцы матрицы. Номера столбцов вводятся с клавиатуры
 */

public class Task8 {

    public static void main(String[] args) {

        int[][] array = {{10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
                {50, 51, 52, 53, 54}};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер первого столбца: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка. Введите номер первого столбца: ");
        }
        int firstColumn = scanner.nextInt();

        System.out.print("Введите номер второго столбца: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка. Введите номер второго столбца: ");
        }
        int secondColumn = scanner.nextInt();

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp = array[i][firstColumn];
                array[i][firstColumn] = array[i][secondColumn];
                array[i][secondColumn] = temp;
            }
        }

        System.out.println("Сформированная матрица " +
                "с переставленными столбцами имеет вид: ");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
        }
    }
}
