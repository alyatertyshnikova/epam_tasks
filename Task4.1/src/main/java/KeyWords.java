package main.java;

import java.io.*;
import java.util.*;

public class KeyWords {
    final static String[] keyWords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch", "synchronised", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"};
    private int[] numberOfKeyWords = new int[keyWords.length];

    public KeyWords() { }

    public boolean getWords(String srcFile, String dstFile){
        if (srcFile==null || dstFile==null){
            return false;
        }
        if(!readFile(srcFile)||!writeFile(dstFile)){
            return false;
        }
        return true;
    }

    private boolean readFile(String fileName) {
        int[] word = new int[30];
        int readByte;
        int keyLength = 0;
        try (FileInputStream fileInput = new FileInputStream(fileName)) {
            while ((readByte = fileInput.read()) != -1) {
                if ((readByte >= 65 && readByte <= 90) || (readByte >= 97 && readByte <= 122)) {
                    word[keyLength] = readByte;
                    keyLength++;
                } else {
                    for (int i = 0; i < keyWords.length; i++) {
                        byte[] foundKeyWord = getRightKeyWord(word);
                        if (Arrays.equals(keyWords[i].getBytes(), foundKeyWord)) {
                            numberOfKeyWords[i]++;
                            break;
                        }
                    }
                    keyLength = 0;
                    Arrays.fill(word, 0);
                }
            }
        } catch (IOException exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }

    private boolean writeFile(String fileName){
        try(FileOutputStream fileOutput=new FileOutputStream(fileName)){
            for(int i=0; i<keyWords.length; i++){
                String line=keyWords[i]+" - "+numberOfKeyWords[i]+"\n";
                fileOutput.write(line.getBytes());
            }
        }
        catch(IOException exception){
            System.out.println(exception);
            return false;
        }
        return true;
    }

    private byte[] getRightKeyWord(int[] word) {
        int length = 0;
        byte[] keyWord;
        while (word[length] != 0) {
            length++;
        }
        keyWord = new byte[length];
        for (int i = 0; i < length; i++) {
            keyWord[i] = (byte) word[i];
        }
        return keyWord;
    }
}
