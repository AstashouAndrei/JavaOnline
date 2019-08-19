package by.java_online.module_2.multidimensional_array;

/*
2. Algorithmization. Массивы массивов, задание 11.
Создать и вывести матрицу 10х20, заполнить случ. эл-ми от 0 до 15. Вывести номера строк, в кот. 5 встречается >= 3 раз
 */

import java.util.Random;

public class Task11 {

    public static void main(String[] args) {

        int[][] array = new int[10][15];

        Random random = new Random();

        System.out.println("Сформированная матрица имеет вид:");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(16);
                System.out.print(array[i][j] + "   ");
            }
        }

        System.out.print("Число 5 встречается более 3-х раз в строках #: ");
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.print(i + " ");
            }
        }
    }
}
