package by.java_online.module_2.array;

import java.util.Arrays;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 8.
Образовать новую последовательность, выбросив минимальный элемент
 */

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину последовательности целых чисел: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка. Введите длину последовательности целых чисел: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 201) - 100);
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int minOccurrenceCounter = 1;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } else if (min == array[i]) {
                minOccurrenceCounter++;
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Количество вхождений минимального элемента: " + minOccurrenceCounter);

        int[] modifiedArray = new int[array.length - minOccurrenceCounter];
        int k = 0;

        for (int element : array) {
            if (min != element) {
                modifiedArray[k] = element;
                k++;
            }
        }
        System.out.println("Последовательность с выброшенными минимальными элементами: "
                + Arrays.toString(modifiedArray));
    }
}
