package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 16.
Написать метод определяющий сумму n-значных чисел, содержащих только нечетные цифры
 */

public class Task16 {

    private static int calculateSumOfNumbersWithOddDigits(int n) {

        int totalSum = 0;

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            int counter = 0;
            int number = i;

            while (number != 0) {
                int x = number % 10;
                if (x % 2 == 0) {
                    counter++;
                }
                number /= 10;
            }

            if (counter == 0) {
                totalSum += i;
            }
        }
        return totalSum;
    }

    private static int countOddDigitsInNumber(int number) {

        int oddCounter = 0;

        while (number != 0) {
            int temp = number % 10;

            if (temp % 2 != 0) {
                oddCounter++;
            }
            number /= 10;
        }
        return oddCounter;
    }

    public static void main(String[] args) {
        System.out.println(calculateSumOfNumbersWithOddDigits(3));
        System.out.println(countOddDigitsInNumber(calculateSumOfNumbersWithOddDigits(3)));
    }
}
