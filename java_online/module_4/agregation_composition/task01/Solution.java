package by.java_online.module_4.agregation_composition.task01;

public class Solution {

    public static void main(String[] args) {

        Word title = new Word("Java (wikipedia.org)");

        Word[] words1 = {new Word("Java"), new Word("is"), new Word("a"),
                new Word("general-purpose"), new Word("programming"),
                new Word("language"), new Word("that"), new Word("is"),
                new Word("class-based"), new Word("and"),
                new Word("object-oriented")};

        Word[] words2 = {new Word("It"), new Word("was"),
                new Word("originally"), new Word("developed"),
                new Word("by"), new Word("James"), new Word("Gosling"),
                new Word("at"), new Word("Sun"), new Word("Microsystems")};

        Sentence[] sentences = {new Sentence(words1), new Sentence(words2)};

        Text text = new Text(title, sentences);
        text.printTitle();
        text.printText();

        Word[] words3 = {new Word("The"), new Word("latest"),
                new Word("versions"), new Word("are"), new Word("Java"),
                new Word("12"), new Word("released"), new Word("in"),
                new Word("March"), new Word("2019")};

        System.out.println();

        Sentence sentence = new Sentence(words3);

        text.addSentence(sentence);
        text.printTitle();
        text.printText();
    }
}
