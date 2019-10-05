package by.java_online.module_3.string_builder;

/*
3. Strings and basics of text processing. Работа со строкой как объектом типа String \ StringBuilder, задание 1.
В строке найти наибольшее количество подряд идущих пробелов
 */

import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    private static int countMaxSpaceRepetitions(String text) {

        int spaceRepetitions = 0;

        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.reverse());


        return 0;
    }

    public static void main(String[] args) {
    countMaxSpaceRepetitions("abcde");
    }
}
