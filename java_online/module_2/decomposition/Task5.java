package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 5.
Написать метод, находящий второе по величение число в массиве
 */

public class Task5 {

    private static int getSecondLargestValue(int[] array) {

        int largestValue = Math.max(array[0], array[1]);
        int secondLargestValue = Math.min(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            if (largestValue < array[i]) {
                secondLargestValue = largestValue;
                largestValue = array[i];
            } else {
                if (secondLargestValue < array[i]) {
                    secondLargestValue = array[i];
                }
            }
        }
        return secondLargestValue;
    }

    public static void main(String[] args) {

        int [] array = {-6, -2, 18, 4, -3, 17, 0, 13};
        System.out.println(getSecondLargestValue(array));
    }
}
