package by.java_online.module_4.simple_classes.task03;

public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Bob", 12, new int[]{7, 8, 8, 9, 10});
        Student student1 = new Student("Mark", 12, new int[]{9, 9, 9, 9, 10});

        Student[] students = {
                new Student("Alfer Natalia", 1, new int[] {9,10,9,9,10}),
                new Student("Budnik Andrei", 1, new int[] {4,7,6,8,7}),
                new Student("Grishkou Dzmitry", 1, new int[] {7,5,6,9,6}),
                new Student("Konushenko Dzmitry", 2, new int[] {8,10,9,9,10}),
                new Student("Lopatova Olga", 1, new int[] {10,10,10,10,10}),
                new Student("Markova Marina", 1, new int[] {9,10,9,10,10}),
                new Student("Nesterenko Svetlana", 2, new int[] {7,9,7,9,10}),
                new Student("Silchenko Elena", 2, new int[] {9,9,9,9,10}),
                new Student("Tishkou Oleg", 2, new int[] {9,8,9,9,9}),
                new Student("Fedorovich Oleg", 2, new int[] {9,9,9,9,9})
        };

        Student.printExcellentStudents(students);

    }
}
