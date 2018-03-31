package test.java;

import main.java.KeyWords;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyWordsTest {
    private String fileSrc;
    private String fileDst;
    private KeyWords keyWords;

    @Before
    public void setUp() {
        keyWords = new KeyWords();
        fileSrc = "/Users/macintosh/IdeaProjects/Task2.1/src/main/java/Pen.java";
        fileDst = "/Users/macintosh/IdeaProjects/Task4.1/src/main/java/keywords.txt";
    }

    @Test
    public void getWordsShouldCreateFileWithKeyWordsAndReturnTrue() {
        assertTrue(keyWords.getWords(fileSrc, fileDst));
    }

    @Test
    public void getWordsShouldReturnFalseForNullArgument() {
        assertFalse(keyWords.getWords(null, fileDst));
        assertFalse(keyWords.getWords(fileSrc, null));
        assertFalse(keyWords.getWords(null, null));
    }

    @Test
    public void getWordsShouldReturnFalseIfIOExceptionHappened() {
        String wrongFileSrc = "file/wrong";
        assertFalse(keyWords.getWords(wrongFileSrc, fileDst));
        assertFalse(keyWords.getWords(fileSrc, wrongFileSrc));
    }
}