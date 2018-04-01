package main.java;

public class Main {
    public static void main(String[] args) {
        ChangeEncoding text = new ChangeEncoding();
        String srcFile = "/Users/macintosh/IdeaProjects/Task4.3/src/main/java/Hello.txt";
        String dstFile = "/Users/macintosh/IdeaProjects/Task4.3/src/main/java/new.txt";
        text.changeEncoding(srcFile, dstFile);

        System.out.println("Result");
        text.readFile(dstFile, "UTF16");
    }
}
