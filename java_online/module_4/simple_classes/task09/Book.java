package by.java_online.module_4.simple_classes.task09;

import java.util.Scanner;

public class Book {

    private int id;
    private String author;
    private String title;
    private String publisher;
    private int yearOfPublishing;
    private int pages;
    private double price;
    private String cover;

    public Book(int id, String author, String title, String publishing, int yearOfPublishing, int pages, double price, String cover) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publishing;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    public String toString() {
        return title + " / " + author + " (" + yearOfPublishing + ")";
    }

    public static void printBookByAuthor(Book[] books) {

        System.out.print("Enter an author: ");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();

        for (Book book : books) {
            if (author.equals(book.author)) {
                System.out.println(book);
            }
        }
    }

    public static void printBookByPublisher(Book[] books) {

        System.out.print("Enter a publisher: ");
        Scanner scanner = new Scanner(System.in);
        String publisher = scanner.nextLine();

        for (Book book : books) {
            if (publisher .equals(book.publisher)) {
                System.out.println(book);
            }
        }
    }

    public static void printBookAfterSetYear(Book[] books) {
        System.out.print("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        for (Book book : books) {
            if (year < book.yearOfPublishing) {
                System.out.println(book);
            }
        }
    }
}
