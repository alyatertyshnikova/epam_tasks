package main.java;

public class Main {
    public static void main(String[] args) {
        KeyWords keyWords = new KeyWords();
        String fileSrc="/Users/macintosh/IdeaProjects/Task2.1/src/main/java/Pen.java";
        String fileDst="/Users/macintosh/IdeaProjects/Task4.2/src/main/java/keywords.txt";
        keyWords.getWords(fileSrc, fileDst);
    }
}

