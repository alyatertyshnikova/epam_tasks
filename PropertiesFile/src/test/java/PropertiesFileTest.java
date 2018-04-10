package test.java;

import main.java.KeyNotFoundException;
import main.java.PropertiesFile;
import main.java.PropertiesFileNotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class PropertiesFileTest {
    private String fileName;
    private PropertiesFile file;

    @Before
    public void setUp() {
        fileName = "/Users/macintosh/IdeaProjects/PropertiesFile/src/file.properties";
        try {
            file = PropertiesFile.getInstance(fileName);
        } catch (PropertiesFileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void getValueShouldReturnValueRelatedToKey() {
        try {
            assertEquals("1", file.getValue("X"));
        } catch (KeyNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void getInstanceShouldReturnObjectCreatedAtFirstTime() {
        String anotherFileName = "/Users/macintosh/IdeaProjects/PropertiesFile/src/another.properties";
        try {
            PropertiesFile anotherFile = PropertiesFile.getInstance(anotherFileName);
            assertEquals(file, anotherFile);
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}