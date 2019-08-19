package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 14.
Написать метод нахождения n-значных чисел, цифры в которых образуют строго возраст. послед-сть.
 */

public class Task15 {

    private static void toAscendingSequence(int n) {

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {

            int counter = 0;
            int number = i;

            while (number != 0) {
                int x = number % 10;
                number /= 10;
                int y = number % 10;
                if (x <= y && number != 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.println(i);

            }
        }
    }

    public static void main(String[] args) {
        toAscendingSequence(2);
    }
}
