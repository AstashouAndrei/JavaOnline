package by.java_online.module_3.chars;

import java.util.Arrays;

/*
3. Strings and basics of text processing. Работа со строкой как с массивом символов, задание 1.
Преобразованить элементы массива из camelCase в snake_case
 */

public class Task1 {

    private static String[] toSnakeCase(String[] array) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                char currentChar = array[i].charAt(j);
                if (Character.isLowerCase(currentChar)) {
                    sb.append(currentChar);
                } else {
                    sb.append("_");
                    sb.append(String.valueOf(currentChar).toLowerCase());
                }
            }
            array[i] = sb.toString();
            sb.setLength(0);
        }
        return array;
    }

    public static void main(String[] args) {

        String[] array = {"epamSystems", "javaOnline", "unitThreeStringAsCharArray"};
        toSnakeCase(array);
        System.out.println(Arrays.toString(array));

    }
}
