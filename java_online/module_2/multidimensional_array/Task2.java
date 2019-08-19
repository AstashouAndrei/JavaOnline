package by.java_online.module_2.multidimensional_array;

/*
2. Algorithmization. Массивы массивов, задание 2.
Вывести элементы квадратной матрицы стоящие на диагонали
 */

public class Task2 {

    public static void main(String[] args) {

        int[][] array = {{10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
                {50, 51, 52, 53, 54}};

        System.out.print("Элементы матрицы, стоящие на диагонале: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}

