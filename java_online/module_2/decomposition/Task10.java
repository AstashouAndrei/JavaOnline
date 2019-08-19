package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 10.
Написать метод для формирования массива цифрами числа N
 */

public class Task10 {

    private static int[] toArrayOfDigits(int number) {

        int arrayLength = 0;

        int temp = number;
        while (temp != 0) {
            arrayLength++;
            temp /= 10;
        }

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[arrayLength-1-i] = number % 10;
            number /= 10;
        }
        return array;
    }

    private static String arrayToString(int[] array) {

        if (array == null) {
            return "Массив = null";
        }

        int maxIndex = array.length - 1;

        StringBuilder builder = new StringBuilder();

        if (maxIndex == -1) {
            return "[]";
        }

        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (maxIndex == i) {
                return builder.append("]").toString();
            }
            builder.append(", ");
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    public static void main(String[] args) {
        int[] testArray = toArrayOfDigits(1234567890);
        System.out.println(arrayToString(testArray));
    }
}
