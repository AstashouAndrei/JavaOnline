package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 13.
Написать метод выводящий все пары "близнецов" на отрезке [n, 2n]
 */

public class Task13 {

    private static void getTwinsNumbers(int number) {

        System.out.print("Близнецы простых чисел на отрезке [" + number + "," + (number * 2) + "]:  ");

        for (int i = number; i <= number * 2 - 2; i++) {
            int counter = 0;
            for (int j = 2; j <= number / 2; j++) {
                if (i % j == 0 || (i + 2) % j == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.print("(" + i + "," + (i + 2) + ") ");
            }
        }
    }

    public static void main(String[] args) {
        getTwinsNumbers(40);
    }
}
