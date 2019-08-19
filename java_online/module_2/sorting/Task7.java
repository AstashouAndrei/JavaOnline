package by.java_online.module_2.sorting;

/*
2. Algorithmization. Сортировки, задание 7.
Даны две неубывающие последовательности. Указать места,
куда нужно вставить эл-ты одной в другую, чтобы новая последовательность также была неубывающей
*/

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        int[] firstSequence = {1, 3, 8, 12, 12, 24, 28, 33};

        int[] secondSequence = {2, 4, 7, 12, 23, 27, 35, 42, 50};

        int[] mergedSequence = new int[firstSequence.length + secondSequence.length];

        int k = 0;
        int j = 0;

        System.out.print("В новой последовательности элементы из " +
                "второй последовательности необходимо вставить в: ");
        for (int i = 0; i < mergedSequence.length; i++) {
            if (k < firstSequence.length && j < secondSequence.length) {
                if (firstSequence[k] > secondSequence[j]) {
                    mergedSequence[i] = secondSequence[j];
                    j++;
                    System.out.print(i + " ");
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
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Объединенная последовательность: " + Arrays.toString(mergedSequence));
    }
}
