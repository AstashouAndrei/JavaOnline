package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 8.
Написать метод для вычисления суммы 3-х последоват. расположенных эл-ов массива от k до m
 */

public class Task8 {

    private static int getArrayElementsSum(int[] array, int fromIndex) {
        int sum = 0;

        if (fromIndex + 2 < array.length) {
            for (int i = fromIndex; i < fromIndex + 3; i++) {
                sum += array[i];
            }
        } else {
            System.out.println("Ошибка. В массиве " + array.length + " элементов.");

        }
        return sum;
    }

    public static void main(String[] args) {

        int[] testArray = {2, 2, 3, 4, 12, 43, -18, 42, 56, 100};
        System.out.println(getArrayElementsSum(testArray, 6));

    }
}
