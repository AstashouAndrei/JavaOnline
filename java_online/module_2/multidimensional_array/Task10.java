package by.java_online.module_2.multidimensional_array;

/*
2. Algorithmization. Массивы массивов, задание 10.
Найти положительные элементы главной диагонали
 */

public class Task10 {

    public static void main(String[] args) {

        int[][] array = {{1, 42, 6, 13, 1},
                                {-1, -7, 9, 28, 2},
                                 {6, 13, 4, 17, 3},
                                 {9, 11, 2, 0, 4},
                                 {3, 8, 0, 53, 15}};

        System.out.println("Матрица имеет вид:");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "   ");
            }
        }

        System.out.print("Положительные элементы главной диагонали: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
        }
    }
}
