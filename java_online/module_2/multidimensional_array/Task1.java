package by.java_online.module_2.multidimensional_array;

/*
2. Algorithmization. Массивы массивов, задание 1.
Вывести все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task1 {

    public static void main(String[] args) {

        int[][] array = {{10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
                {1, 2, 3, 4, 5}};

        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0 && array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
