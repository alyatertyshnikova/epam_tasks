package test.java;

import main.java.ChangeEncoding;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeEncodingTest {
    private ChangeEncoding text;
    private String srcFile;
    private String dstFile;

    @Before
    public void setUp() {
        text = new ChangeEncoding();
        srcFile = "/Users/macintosh/IdeaProjects/Task4.3/src/main/java/Hello.txt";
        dstFile = "/Users/macintosh/IdeaProjects/Task4.3/src/main/java/new.txt";
    }

    @Test
    public void changeEncodingShouldReturnFalseForNullArgument() {
        assertFalse(text.changeEncoding(null, null));
        assertFalse(text.changeEncoding(null, dstFile));
        assertFalse(text.changeEncoding(srcFile, null));
    }

    @Test
    public void changeEncodingShouldReturnFalseIfExceptionHappens() {
        String wrongFileName = "/wrong/name";
        assertFalse(text.changeEncoding(wrongFileName, dstFile));
        assertFalse(text.changeEncoding(srcFile, wrongFileName));
        assertFalse(text.changeEncoding(wrongFileName, wrongFileName));
    }

    @Test
    public void changeEncodingShouldReturnTrueAndChangeEncodingToUTF16() {
        assertTrue(text.changeEncoding(srcFile, dstFile));
    }

    @Test
    public void readFileShoulReturnFalseForNullArgument() {
        assertFalse(text.readFile(null, "UTF8"));
        assertFalse(text.readFile(srcFile, null));
        assertFalse(text.readFile(null, null));
    }

    @Test
    public void readFileShouldReturnFalseIfExceptionHappens() {
        String wrongFileName = "/wrong/name";
        assertFalse(text.readFile(wrongFileName, "UTF8"));
        assertFalse(text.readFile(srcFile, "a"));
    }

    @Test
    public void readFileShouldReturnTrueAndPrintTextInRequiredFormat() {
        assertTrue(text.readFile(srcFile, "UTF8"));
    }

}