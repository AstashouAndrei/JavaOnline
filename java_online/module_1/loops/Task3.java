package by.java_online.module_1.loops;

/*
Basic of software code development. Циклы, задание 2.
Определить сумму квадратов первых 100 чисел
 */

public class Task3 {

    public static void main(String[] args) {

        int result = 0;
        for (int i = 0; i <= 100; i++) {  // включая 100
            result += Math.pow(i, 2);
        }

        System.out.println("Сумма квадратов первых 100 чисел составляет: " + result);
    }
}
