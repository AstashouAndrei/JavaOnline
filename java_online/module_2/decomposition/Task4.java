package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 4.
Написать метод, определяющий между какими из пар точек наиб. расстояние
 */

public class Task4 {

    private static void distanceBetweenPoints(double[][] array) {

        printPoints(array);

        double distance = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                double temp = Math.sqrt(Math.pow((array[j][0] - array[i - 1][0]), 2) + Math.pow(array[j][1] - array[i - 1][1], 2));
                if (distance < temp) {
                    distance = temp;
                    firstIndex = i;
                    secondIndex = j + 1;
                }
            }
        }

        System.out.println("Наиболее удалены друг от друга точки A" + (firstIndex) + " и А" + (secondIndex)
                + ". Расстояние между ними составляет: " + distance);
    }

    private static void printPoints(double[][] array) {
        System.out.println("На плоскости заданы " + array.length + " точек с координатами:");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            System.out.print("А" + (i + 1) + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {

        double[][] test_1 = {{-3, 2}, {3, 4}, {7, 1}, {4, -2}, {1, -5}, {-1, -2}, {-3, -1}};
        distanceBetweenPoints(test_1);

//        double[][] test_2 = {{2, 7}, {-3, -3}, {2, 6}, {-5, -4}};
//        distanceBetweenPoints(test_2);
    }
}