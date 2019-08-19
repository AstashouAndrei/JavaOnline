package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 17.
Написать метод вычисляющий кол-во раз вычитания из числа суммы его цифр до получения 0.
 */

public class Task17 {

    private static int calculateSubtractionCountsToZero(int number) {

        int counter = 0;

        while (number != 0) {
            int temp = number;
            int x = 0;
            while (temp != 0) {
                x += temp % 10;
                temp /= 10;
            }
            counter++;
            number -= x;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(calculateSubtractionCountsToZero(42));
    }
}
