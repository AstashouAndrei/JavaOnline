package by.java_online.module_2.multidimensional_array;

/*
2. Algorithmization. Массивы массивов, задание 9.
Подсчить сумму элементов в кадом столбце, определить столбец с max суммой
 */

public class Task9 {

    public static void main(String[] args) {

        int[][] array = {{10, 1, 1, 13, 1},
                {20, 2, 2, 23, 2},
                {30, 3, 3, 33, 3},
                {40, 41, 4, 43, 4},
                {10, 5, 52, 53, 5}};

        int currentSum = 0;
        int maxSum = 0;
        int columnMaxIndex = 0;

        for (int i = 0; i < array.length; i++, currentSum = 0) {
            for (int j = 0; j < array.length; j++) {
                currentSum += array[j][i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    columnMaxIndex = i;
                }
            }
            System.out.println("Сумма элементов " + i + "-го столбца: " + currentSum);
        }

        System.out.println("Столбец " + columnMaxIndex + " содержит максимальную сумму " +
                "элементов, которая составляет: " + maxSum);
    }
}
