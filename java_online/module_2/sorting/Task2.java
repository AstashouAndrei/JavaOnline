package by.java_online.module_2.sorting;

/*
2. Algorithmization. Сортировки, задание 2.
Объединить две неубываюшие последовательности в одну неубывающую
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int firstSequenceLength;
        int secondSequenceLength;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Задайте длину первой последовательности. ");
        do {
            System.out.print("Введите положительное, целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите целое число: ");
                scanner.next();
            }
            firstSequenceLength = scanner.nextInt();
        } while (firstSequenceLength < 0);

        int[] firstSequence = new int[firstSequenceLength];


        System.out.print("Задайте длину второй последовательности. ");
        do {
            System.out.print("Введите положительное, целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите целое число: ");
                scanner.next();
            }
            secondSequenceLength = scanner.nextInt();
        } while (secondSequenceLength < 0);

        int[] secondSequence = new int[secondSequenceLength];


        System.out.print("Первая последовательность: ");
        for (int i = 0; i < firstSequence.length; i++) {
            firstSequence[i] = i * 2;
            System.out.print(firstSequence[i] + " ");
        }
        System.out.println();

        System.out.print("Вторая последовательность: ");
        for (int i = 0; i < secondSequence.length; i++) {
            secondSequence[i] = 2 * i + 1;
            System.out.print(secondSequence[i] + " ");
        }
        System.out.println();


        int[] mergedSequence = new int[firstSequence.length + secondSequence.length];

        int k = 0;
        int j = 0;

        for (int i = 0; i < mergedSequence.length; i++) {
            if (k < firstSequence.length && j < secondSequence.length) {
                if (firstSequence[k] > secondSequence[j]) {
                    mergedSequence[i] = secondSequence[j];
                    j++;
                } else {
                    mergedSequence[i] = firstSequence[k];
                    k++;
                }
            } else if (k < firstSequence.length) {
                mergedSequence[i] = firstSequence[k];
                k++;
            } else {
                mergedSequence[i] = secondSequence[j];
                j++;
            }
        }
        System.out.println("Объединенная последовательность: " + Arrays.toString(mergedSequence));
    }
}
