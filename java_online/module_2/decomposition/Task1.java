package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 1.
Написать методы для нахождения НОК, НОД
 */

public class Task1 {

    private static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int gCommonDivider = 1;

        for (int i = 2; i <= Math.min(firstNumber, secondNumber); i++) {
            if ((firstNumber % i == 0) && (secondNumber % i == 0)) {
                gCommonDivider = i;
            }
        }
        return gCommonDivider;
    }

    private static int getLeastCommonMultiple(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / getGreatestCommonDivisor(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(936, 1404));
        System.out.println(getLeastCommonMultiple(936, 1404));
    }
}
