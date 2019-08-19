package by.java_online.module_1.loops;

/*
Basic of software code development. Циклы, задание 6.
"Вывести на экран соответствия символов числовым значениям"
 */

public class Task6 {

    public static void main(String[] args) {

        System.out.println("Соответствие символов численным значениям (ASCII)");

        for (int i = 0; i <= 255; i++) {
            char c = (char) i;
            System.out.println("Символу: " + c + " соответствует численное значение: " + i);
        }

    }
}
