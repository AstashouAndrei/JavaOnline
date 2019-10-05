package by.java_online.module_3.chars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Strings and basics of text processing. Работа со строкой как с массивом символов, задание 3.
Найти количество цифр в строке
 */

public class Task3 {

    private static int countDigitsByChar(String text) {

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char nextChar = text.charAt(i);
            if (Character.isDigit(nextChar)) {
                counter++;
            }
        }
        return counter;
    }


    private static int countDigitsByRegex(String text) {

        int digitCounter = 0;

        Pattern pattern = Pattern.compile("\\d");
        Matcher m = pattern.matcher(text);

        while (m.find()) {
            digitCounter++;
        }
        return digitCounter;
    }

    public static void main(String[] args) {

        String text = "Flight SU270 from Moscow to Bangkok was landed at 10:45 05/20/2018";
        System.out.println(countDigitsByRegex(text));
        System.out.println(countDigitsByChar(text));
        String text2 = "2019.08.18, Sunday, 20:55";
        System.out.println(countDigitsByChar(text2));
        System.out.println(countDigitsByRegex(text2));

    }
}