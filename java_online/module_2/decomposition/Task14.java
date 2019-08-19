package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 14.
Написать метод для нахождения чисел Армстронга на отрезке [1, k]
 */

public class Task14 {

    private static void printArmstrongNumbersRow(int number) {

        System.out.print("Числа Армстронга в диапазоне [1," + number + "]: ");

        for (int i = 1; i <= number; i++) {
            long power = getPowerOfNumber(i);
            long sum = 0;
            long tempDigit = i;
            while (tempDigit != 0) {
                sum += (long) Math.pow((tempDigit % 10), power);
                tempDigit /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }

    private static int getPowerOfNumber(int number) {

        int power = 0;
        while (number != 0) {
            number /= 10;
            power++;
        }
        return power;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printArmstrongNumbersRow(100_000_00); // 9 сек
    }
}


//      printArmstrongNumbersRow(100_000_000); // >100 сек
//      long stop = System.currentTimeMillis() - start;
//      System.out.println(stop / 1000 + " секунд");