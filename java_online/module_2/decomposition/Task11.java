package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 11.
Написать метод определяющий в каком из двух чисел больше цифр
 */

public class Task11 {

    private static int getMaxDigitNumber(int firstNumber, int secondNumber) {

        int firstNumberDigitCounter = (int) (Math.log10(Math.abs(firstNumber + 1)));
        int secondNumberDigitCounter = (int) (Math.log10(Math.abs(secondNumber + 1)));

        if (firstNumberDigitCounter > secondNumberDigitCounter) {
            return firstNumber;
        } else if (firstNumberDigitCounter < secondNumberDigitCounter) {
            return secondNumber;
        } else {
            System.out.println("У чисел одинаковое количество цифр. Большее по значению: " + Math.max(firstNumber, secondNumber));
            return Math.max(firstNumber, secondNumber);
        }
    }

    public static void main(String[] args) {

        System.out.println(getMaxDigitNumber(-168, 42));
        System.out.println(getMaxDigitNumber(0, 4482));

    }
}
