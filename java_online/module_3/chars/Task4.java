package by.java_online.module_3.chars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Strings and basics of text processing. Работа со строкой как с массивом символов, задание 3.
Найти количество чисел в строке
 */

public class Task4 {

    private static int countDigitsByChar(String text) {
//        text+=" ";

        int counter = 0;

        for (int i = 0; i < text.length()-1; i++) {
            char nextChar = text.charAt(i);
            while (Character.isDigit(nextChar)) {
                i++;
                nextChar = text.charAt(i);
                if (!Character.isDigit(nextChar)) {
                    counter++;
                }
            }

        }
        return counter;
    }

    private static int countDigitsByRegex(String text) {

        int digitCounter = 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher m = pattern.matcher(text);

        while (m.find()) {
            digitCounter++;
        }
        return digitCounter;
    }

    public static void main(String[] args) {

        String text = " 1 2018";
        System.out.println(text.length());
//        System.out.println(countDigitsByRegex(text));
        System.out.println(countDigitsByChar(text));

    }
}
