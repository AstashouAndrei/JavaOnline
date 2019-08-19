package by.java_online.module_2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 6.
Вычислить сумму чисел последовательности, порядковые номера которых являются простыми числами
 */

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Введите длину массива: ");  //5
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину массива: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];


        int sumOfPrimeNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            array[i] = random.nextInt(100);
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 0 && i >= 2) {
                sumOfPrimeNumbers += array[i];
            }
        }
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));
        System.out.println("Искомая сумма: " + sumOfPrimeNumbers);
    }
}