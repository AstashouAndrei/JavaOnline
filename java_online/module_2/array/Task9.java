package by.java_online.module_2.array;

/*
2. Algorithmization. Одномерные массивы, задание 9.
Найти наиболее часто встречающийся элемент. Если их несколько, определить наименьший.
 */

public class Task9 {

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 0, 0, 0, 0, 5};

        int maxFrequentElementCounter = 1;
        int mostFrequentElement = array[0];
        int indexOfMaxFrequentElement = 0;

        for (int i = 0; i < array.length; i++) {
            int tempFrequentElementCounter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    tempFrequentElementCounter++;
                }
            }
            if (maxFrequentElementCounter < tempFrequentElementCounter) {
                maxFrequentElementCounter = tempFrequentElementCounter;
                indexOfMaxFrequentElement = i;
            }
            if (maxFrequentElementCounter == tempFrequentElementCounter) {
                mostFrequentElement = Math.min(array[i], array[indexOfMaxFrequentElement]);
            }
        }
        System.out.println("Наиболее часто встречающейся минимальный элемент: "
                + mostFrequentElement + ". Встречается " + maxFrequentElementCounter + " раз.");
    }
}
