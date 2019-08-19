package by.java_online.module_2.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Сортировки, задание 1.
Объединить два массива, вставив второй между k-м и (k+1)-м элементами первого
*/

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstSequenceLength;
        int secondSequenceLength;
        int mergingElement;

        System.out.print("Задайте длину первой последовательности. ");
        do {
            System.out.print("Введите положительное, целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите целое число: ");
                scanner.next();
            }
            firstSequenceLength = scanner.nextInt();
        } while (firstSequenceLength < 0);

        System.out.print("Задайте длину второй последовательности. ");
        do {
            System.out.print("Введите положительное, целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите целое число: ");
                scanner.next();
            }
            secondSequenceLength = scanner.nextInt();
        } while (secondSequenceLength < 0);

        System.out.print("Задайте элемент k. ");
        do {
            System.out.print("Введите положительное, целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введите целое число: ");
                scanner.next();
            }
            mergingElement = scanner.nextInt();
        } while (mergingElement <= 0);


        int[] firstSequence = new int[Math.max(firstSequenceLength, secondSequenceLength)];
        int[] secondSequence = new int[Math.min(firstSequenceLength, secondSequenceLength)];


        Random random = new Random();

        for (int i = 0; i < firstSequence.length; i++) {
            firstSequence[i] = random.nextInt(10);
        }
        for (int i = 0; i < secondSequence.length; i++) {
            secondSequence[i] = random.nextInt(20);
        }

        System.out.println("Первая последовательность: " + Arrays.toString(firstSequence));
        System.out.println("Вторая последовательность: " + Arrays.toString(secondSequence));

        int indexOne = 0;
        int indexTwo = 0;

        int[] mergedSequence = new int[firstSequence.length + secondSequence.length];
        for (int i = 0; i <= Math.max(firstSequence.length, secondSequence.length); i++) {
            if (i != mergingElement + 1) {
                mergedSequence[indexOne++] = firstSequence[indexTwo++];
            } else {
                for (int j = 0; j < Math.min(firstSequence.length, secondSequence.length); j++) {
                    mergedSequence[indexOne++] = secondSequence[j];
                }
            }
        }
        System.out.println("Объединенная последовательность: " + Arrays.toString(mergedSequence));
    }
}
// 5 4 2
