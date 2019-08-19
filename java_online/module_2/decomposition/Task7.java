package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 7.
Написать метод для вычисления суммы факториалов всех нечетных от 1 до 99
 */

public class Task7 {

    private static int sumOddNumbersFactorials(int number) {

        int temp = 1;
        int result = 0;

        if (number <=9) {
            for (int i = 1; i <=number ; i++) {
                if (i % 2 != 0) {
                    for (int j = 1; j <= i ; j++) {
                        temp *= j;
                    }
                    result+=temp;
                    temp=1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOddNumbersFactorials(9));
        System.out.println(sumOddNumbersFactorials(7));
        System.out.println(sumOddNumbersFactorials(8));
        System.out.println(sumOddNumbersFactorials(82));
    }
}
