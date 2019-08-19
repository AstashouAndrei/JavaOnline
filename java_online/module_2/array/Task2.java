package by.java_online.module_2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
2. Algorithmization. Одномерные массивы, задание 2.
"Заменить все члены последовательности, которые больше заданного Z, подсчитать количество замен"
*/

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину последовательности чисел: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите длину последовательности чисел: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];


        Random random = new Random();
        System.out.print("Последовательность случайных чисел: { ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("}");

        System.out.print("Введите элемент Z: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введите элемент Z: ");
            scanner.next();
        }
        int elementZ = scanner.nextInt();

        int replacingCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > elementZ) {
                array[i] = elementZ;
                replacingCounter++;
            }
        }

        System.out.println("Количество произведенных замен: " + replacingCounter);
        System.out.println("Измененная последовательность: " + Arrays.toString(array));
    }
}