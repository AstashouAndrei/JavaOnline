package by.java_online.module_1.linear;

import java.util.Scanner;

/*
Basic of software code development. Линейные программы, задание 4.
"Поменять местами дробную и целую части числа"
 */

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите действительное число вида nnn,ddd: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка. Введите число вида nnn,ddd");
            scanner.next();
        }
        double number = scanner.nextDouble();

        double reverseNumber = (number * 1000) % 1000 + Math.floor(number) / 1000;

        System.out.println("Результат замены местами целой и дробной частей введенного числа: " + reverseNumber);

    }
}
