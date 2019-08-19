package by.java_online.module_2.sorting;

/*
2. Algorithmization. Сортировки, задание 3.
Написать алгоритм сортировки обменами
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sequenceLength;
        System.out.print("Задайте длину первой последовательности. ");
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
            array[i] = sequenceLength - i;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int swapCounter = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapCounter++;
                }
            }
        }

        System.out.println("Последовательность после сортировки обменами имеет вид: " + Arrays.toString(array));
        System.out.println("Количество выполненных перестановок: " + swapCounter);
    }
}
