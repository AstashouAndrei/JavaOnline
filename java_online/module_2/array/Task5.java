package by.java_online.module_2.array;

import java.util.Arrays;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 5.
"Вывести на печать те числа из последовательности, для которых значение числа больше порядкового номера"
 */

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");  //5
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину массива: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];

        System.out.print("Введите начало диапазона случайных чисел: ");  //-5
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите начало диапазона случайных чисел: ");
            scanner.next();
        }
        int startWith = scanner.nextInt();

        System.out.print("Введите конец диапазона случайных чисел: ");    //5
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите конец диапазона случайных чисел: ");
            scanner.next();
        }
        int endWith = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * (endWith - startWith + 1)) - endWith);
        }

        System.out.println("Массив случайных чисел: " + Arrays.toString(array));

        System.out.print("Элементы массива, для которых a[i] > i: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) System.out.print(array[i] + " ");
        }
    }
}
//array[i] = (Math.random() * (endWith - startWith + 1) + startWith);