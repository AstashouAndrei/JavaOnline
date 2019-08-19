package by.java_online.module_2.decomposition;

/*
2. Algorithmization. Декомпозция, задание 9.
Написать метод вычисления площади 4-х угольника по сторонам и одному прямому углу
 */

public class Task9 {

    private static double getQuadrangleSquare(int x, int y, int z, int t) {

        int firstTriangleSquare = x * y / 2;

        double diagonalLength = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        double halfSecondTrianglePerimeter = (z + t + diagonalLength) / 2;

        double secondTriangleSquare = Math.sqrt(halfSecondTrianglePerimeter *
                (halfSecondTrianglePerimeter - z) * (halfSecondTrianglePerimeter - t) * (halfSecondTrianglePerimeter - diagonalLength));

        return firstTriangleSquare + secondTriangleSquare;
    }

    public static void main(String[] args) {
        System.out.println(getQuadrangleSquare(8, 18, 12, 10));
    }
}
