package by.java_online.module_2.decomposition;

import java.util.Arrays;

/*
2. Algorithmization. Декомпозция, задание 12.
Написать метод формирования массива, с числами сумма цифр кот. равна K и не больше N
 */

public class Task12 {

    private static int[] toFormArray(int K, int N) {

        int[] array = new int[calculateArrayLength(K, N)];
        int index = 0;

        for (int i = 0; i < N; i++) {
            int tempNumber = i;
            int digitsSum = 0;
            while (tempNumber != 0) {
                digitsSum += tempNumber % 10;
                tempNumber /= 10;
            }
            if (digitsSum < N && digitsSum == K) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    private static int calculateArrayLength(int K, int N) {

        int arrayLength = 0;

        for (int i = 0; i < N; i++) {
            int tempNumber = i;
            int sum = 0;
            while (tempNumber != 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }
            if (sum < N && sum == K) {
                arrayLength++;
            }
        }
        return arrayLength;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(toFormArray(16, 400)));
    }
}
