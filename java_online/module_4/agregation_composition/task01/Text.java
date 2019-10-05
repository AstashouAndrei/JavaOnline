package by.java_online.module_4.agregation_composition.task01;

public class Text {

    private Word title;
    private Sentence[] sentences;

    public Text(Word title, Sentence[] sentences) {
        this.title = title;
        this.sentences = sentences;
    }

    public void printTitle() {
        System.out.println(title);
    }

    public void printText() {
        for (Sentence sentence : sentences) {
            System.out.println(sentence.toString() + " ");
        }
    }

    public void addSentence(Sentence sentence) {

        Sentence[] sent = new Sentence[this.sentences.length + 1];

        for (int i = 0; i < sentences.length; i++) {
            sent[i] = this.sentences[i];
        }

        sent[this.sentences.length] = sentence;
        sentences = sent;
    }

    @Override
    public String toString() {
        return title.getWord();
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }
}
