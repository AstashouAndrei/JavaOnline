package by.java_online.module_2.array;

import java.util.Arrays;
/*
2. Algorithmization. Одномерные массивы, задание 4.
Поменять местами наибольший и наименьший элементы массива
 */

public class Task4 {

    public static void main(String[] args) {

        double[] array = {32.12, 87.09, -46.34, 4.8, -73.87, 68.62, -56.07};

        double min = array[0];
        double max = array[0];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            } else if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;

        System.out.println(Arrays.toString(array));
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
