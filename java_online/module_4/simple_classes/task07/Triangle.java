package by.java_online.module_4.simple_classes.task07;

public class Triangle {

    private double[] coordA;
    private double[] coordB;
    private double[] coordC;

    private double lengthAB;
    private double lengthAC;
    private double lengthBC;

    public Triangle(double[] A, double[] B, double[] C) {
        this.coordA = A;
        this.coordB = B;
        this.coordC = C;
        this.lengthAB = Math.sqrt(Math.pow((B[0] - A[0]), 2) + Math.pow((B[1] - A[1]), 2));
        this.lengthAC = Math.sqrt(Math.pow((C[0] - A[0]), 2) + Math.pow((C[1] - A[1]), 2));
        this.lengthBC = Math.sqrt(Math.pow((B[0] - C[0]), 2) + Math.pow((B[1] - C[1]), 2));
    }

    public double getPerimeter() {
        return lengthAB + lengthAC + lengthBC;
    }

    public double getArea() {
        double halfPer = getPerimeter() / 2;
        return Math.sqrt(halfPer * (halfPer - lengthAB) * (halfPer - lengthAC) * (halfPer - lengthBC));
    }

    public double[] getMediansIntersectionCoords() {
        double[] cords = new double[2];
        cords[0] = (coordA[0] + coordB[0] + coordC[0]) / 3;
        cords[1] = (coordA[1] + coordB[1] + coordC[1]) / 3;
        return cords;
    }

    public double[] getCoordA() {
        return coordA;
    }

    public void setCoordA(double[] coordA) {
        this.coordA = coordA;
    }

    public double[] getCoordB() {
        return coordB;
    }

    public void setCoordB(double[] coordB) {
        this.coordB = coordB;
    }

    public double[] getCoordC() {
        return coordC;
    }

    public void setCoordC(double[] coordC) {
        this.coordC = coordC;
    }

    public double getLengthAB() {
        return lengthAB;
    }

    public void setLengthAB(double lengthAB) {
        this.lengthAB = lengthAB;
    }

    public double getLengthAC() {
        return lengthAC;
    }

    public void setLengthAC(double lengthAC) {
        this.lengthAC = lengthAC;
    }

    public double getLengthBC() {
        return lengthBC;
    }

    public void setLengthBC(double lengthBC) {
        this.lengthBC = lengthBC;
    }
}
