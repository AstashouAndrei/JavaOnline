package by.java_online.module_1.loops;

import java.math.BigInteger;

/*
Basic of software code development. Циклы, задание 3.
Определить произведение квадратов первых 200 чисел
 */

public class Task4 {

    public static void main(String[] args) {

        BigInteger bInteger = BigInteger.ONE;

        System.out.println("Произведение квадратов первых 200 чисел составляет:");

        for (int i = 1; i <= 200; ++i) {  // включая 200
            bInteger = bInteger.multiply(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)));
        }

        System.out.println(bInteger);
    }
}
