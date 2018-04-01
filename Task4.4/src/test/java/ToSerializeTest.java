package test.java;

import main.java.MovieCollection;
import main.java.ToSerialize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToSerializeTest {
    private MovieCollection collection;
    private String fileName;

    @Before
    public void setUp() {
        collection = new MovieCollection();
        collection.defaultCollection();
        fileName = "/Users/macintosh/IdeaProjects/Task4.4/src/main/java/Films.txt";
    }

    @Test
    public void toSerializeShouldReturnFalseForNullFileName() {
        assertFalse(ToSerialize.toSerialize(collection, null));
    }

    @Test
    public void toSerializeShouldReturnFalseIfExceptionHappens() {
        assertFalse(ToSerialize.toSerialize(collection, "/wrong/name"));
    }

    @Test
    public void toSerializeShouldReturnTrueAndSerializeObject() {
        assertTrue(ToSerialize.toSerialize(collection, fileName));
    }

    @Test
    public void toDeserializeShouldReturnNullForNullFileName() {
        assertNull(ToSerialize.toDeserialize(null));
    }

    @Test
    public void toDeserializeShouldReturnFalseIfExceptionHappens() {
        assertNull(ToSerialize.toDeserialize("/wrong/name"));
    }

    @Test
    public void toDeserializeShouldReturnObjectFromFile(){
        ToSerialize.toSerialize(collection, fileName);
        assertEquals(collection, ToSerialize.toDeserialize(fileName));
    }
}