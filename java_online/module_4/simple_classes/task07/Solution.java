package by.java_online.module_4.simple_classes.task07;

public class Solution {

    public static void main(String[] args) {

        Triangle t = new Triangle(new double[]{1, 2}, new double[]{2, 3}, new double[]{3, 2});

        System.out.println("Triangle perimeter is: " + t.getPerimeter());

        System.out.println("Triangle area is: " + t.getArea());

        System.out.println("Coordinates of medians Intersection: [" +
                t.getMediansIntersectionCoords()[0] +
                "," + t.getMediansIntersectionCoords()[1] + "]");
    }
}
