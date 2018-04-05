package test.java;

import main.java.MovieCollection;
import main.java.MoviesSerializer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoviesSerializerTest {
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
        assertFalse(MoviesSerializer.toSerialize(collection, null));
    }

    @Test
    public void toSerializeShouldReturnFalseIfExceptionHappens() {
        assertFalse(MoviesSerializer.toSerialize(collection, "/wrong/name"));
    }

    @Test
    public void toSerializeShouldReturnTrueAndSerializeObject() {
        assertTrue(MoviesSerializer.toSerialize(collection, fileName));
    }

    @Test
    public void toDeserializeShouldReturnNullForNullFileName() {
        assertNull(MoviesSerializer.toDeserialize(null));
    }

    @Test
    public void toDeserializeShouldReturnFalseIfExceptionHappens() {
        assertNull(MoviesSerializer.toDeserialize("/wrong/name"));
    }

    @Test
    public void toDeserializeShouldReturnObjectFromFile() {
        MoviesSerializer.toSerialize(collection, fileName);
        assertEquals(collection, MoviesSerializer.toDeserialize(fileName));
    }
}