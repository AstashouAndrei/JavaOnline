package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 2.
Написать метод для нахождения НОД четырех чисел
 */

public class Task2 {

    private static int getGreatestCommonDivisor(int first, int second, int third, int fourth) {
        int gCommonDivider = 1;

        for (int i = 2; i <= Math.min((Math.min(first, second)), Math.min(third, fourth)); i++) {
            if ((first % i == 0) && (second % i == 0) && (third % i == 0) && (fourth % i == 0)) {
                gCommonDivider = i;
            }
        }
        return gCommonDivider;
    }

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(17136, 24276, 29988, 5236));
        System.out.println(getGreatestCommonDivisor(4641, 408, 3536, 8772));

    }
}
