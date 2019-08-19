package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 3.
Написать метод расчета площади правильного 6-ти угольника со стороной а
 */

public class Task3 {

    private static double getRegularHexagonSquare(double hexSide) {
        return ( 3 * Math.sqrt(3) * Math.pow(hexSide,2)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(getRegularHexagonSquare(5));
        System.out.println(getRegularHexagonSquare(12));
        System.out.println(getRegularHexagonSquare(20));
    }
}
