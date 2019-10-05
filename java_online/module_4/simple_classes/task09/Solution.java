package by.java_online.module_4.simple_classes.task09;

public class Solution {

    public static void main(String[] args) {

        Book[] books = {
                new Book(1242, "Mikhail Bulgakov", "The Master and Margarita", "YMCA Press", 1967, 458, 56.7, "Hardcover"),
                new Book(6863, "Harper Lee", "To Kill a Mockingbird", "J. B. Lippincott & Co.", 1960, 324, 41.9, "Softcover"),
                new Book(3723, "Daniel Keyes", "Flowers for Algernon", "Harcourt, Brace & World", 1959, 421, 71.2, "Hardcover"),
                new Book(1865, "John Fowles", "The Collector", "Jonathan Cape", 1963, 360, 39.9, "Softcover"),
                new Book(9317, "Leo Tolstoy", "War and Peace", "The Russian Messenger", 1869, 812, 156.3, "Hardcover"),
                new Book(7586, "J. D. Salinger", "The Catcher in the Rye", "Little, Brown and Company", 1951, 278, 66.1, "Hardcover"),
                new Book(7586, "Ernest Hemingway", "A Farewell to Arms", "Scribner", 1929, 355, 66.1, "Hardcover"),
                new Book(7586, "Ken Kesey", "One Flew Over the Cuckoo's Nest", "Viking Press", 1962, 320, 66.1, "Hardcover")
        };

        Book.printBookByAuthor(books);
        Book.printBookByPublisher(books);
        Book.printBookAfterSetYear(books);
    }
}
