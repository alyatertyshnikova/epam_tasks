package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeyWords {
    final static String[] keyWords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch", "synchronised", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"};
    final static Pattern pattern = Pattern.compile("[a-z]+");
    private int[] numberOfKeyWords;

    public KeyWords() {
        numberOfKeyWords = new int[keyWords.length];
    }

    public boolean getWords(String srcFile, String dstFile) {
        if (srcFile==null || dstFile==null){
            return false;
        }
        if(!readFile(srcFile)||!writeFile(dstFile)){
            return false;
        }
        return true;
    }

    public boolean readFile(String fileName) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    for (int i = 0; i < keyWords.length; i++) {
                        if (keyWords[i].equals(matcher.group(0))) {
                            numberOfKeyWords[i]++;
                            break;
                        }
                    }
                }
            }
        } catch (IOException exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }

   public boolean writeFile(String fileName){
        try(FileWriter writer=new FileWriter(fileName)){
            for(int i=0; i<keyWords.length; i++){
                writer.write(keyWords[i]+" - "+numberOfKeyWords[i]+"\n");
            }
        }catch (IOException exception){
            System.out.println(exception);
            return false;
        }
        return true;
   }
}
