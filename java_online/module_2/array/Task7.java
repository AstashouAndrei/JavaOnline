package by.java_online.module_2.array;

import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 7.
Вычислить max (a[1] + a[2*n], a[2] + a[2*n-1], ... , a[n] + a[n+1])
 */

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину последовательности n: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину последовательности n: ");
            scanner.next();
        }
        double[] array = new double[scanner.nextInt() * 2];

        Random random = new Random();

        System.out.print("Последовательность вида a1, a2, ..., a2n: { ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println("}");

        double[] arrayOfSums = new double[array.length / 2];

        double maxPairSum = 0;

        for (int i = 0; i < arrayOfSums.length; i++) {
            arrayOfSums[i] = array[i] + array[2 * arrayOfSums.length - i - 1];
            if (maxPairSum < arrayOfSums[i]) {
                maxPairSum = arrayOfSums[i];
            }
        }
        System.out.printf("Результат вычисления max(): " + "%.2f  ", maxPairSum);
    }
}
