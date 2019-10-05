package by.java_online.module_3.chars;

/*
3. Strings and basics of text processing. Работа со строкой как с массивом символов, задание 2.
Заменить вхлждения "word" на "letter" в строке
 */

public class Task2 {

    private static String changeWordToLetter(String text) {
        return text.replaceAll(" [wW]ord " , " letter ");
    }

    public static void main(String[] args) {
        String text = "Microsoft Word is a word processor developed by Microsoft.";
        System.out.println(changeWordToLetter(text));
    }
}
