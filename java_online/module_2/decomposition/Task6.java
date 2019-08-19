package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 6.
Написать метод, проверяющий, являются ли три числа взаимно простыми
 */

public class Task6 {

    private static boolean isCoprimeIntegers(int a, int b, int c) {

        boolean result = false;

        int minNumber = Math.min(Math.min(a, b), c);

        for (int i = 2; i < minNumber; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isCoprimeIntegers(18, 50, 25));
        System.out.println(isCoprimeIntegers(18, 50, 26));
    }
}
