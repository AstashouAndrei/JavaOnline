package by.java_online.module_4.agregation_composition.task01;

public class Sentence {

    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Word words : words) {
            sb.append(words.toString() + " ");
        }

        return sb.toString().trim() + ".";
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }
}
