package by.java_online.module_1.linear;

import java.util.Scanner;

/*
Basic of software code development. Линейные программы, задание 5.
"Преобразовать заданное количество секунд в формат ч/мин/сек"
 */

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, представляющее длительность в секундах: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка. Введие целое число секунд: ");
            scanner.next();
        }
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = totalSeconds % 3600 / 60;
        int seconds = totalSeconds % 60;

        System.out.print("Значение введенной длительности в формате ННч ММмин SSс : ");
        System.out.println(String.format("%02dч %02dмин %02dс", hours, minutes, seconds));
    }
}
