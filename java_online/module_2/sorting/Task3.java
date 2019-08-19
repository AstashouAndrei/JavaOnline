package by.java_online.module_2.sorting;

/*
2. Algorithmization. Сортировки, задание 3.
Написать алгоритм сортировки выбором
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sequenceLength;
        System.out.print("Задайте длину последовательности: ");
        do {
            System.out.print("Введите положительное, целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите целое число: ");
                scanner.next();
            }
            sequenceLength = scanner.nextInt();
        } while (sequenceLength < 0);

        int[] array = new int[sequenceLength];

        System.out.print("Последовательность до сортировки имеет вид: ");
        for (int i = 0; i < sequenceLength; i++) {
            array[i] = (int) Math.pow(i, 2);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int temp;
        int tempIndex;

        for (int i = 0; i < array.length - 1; i++) {
            tempIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[tempIndex]) {
                    tempIndex = j;
                }
                temp = array[tempIndex];
                array[tempIndex] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Последовательность после сортировки выбором имеет вид: " + Arrays.toString(array));
    }
}