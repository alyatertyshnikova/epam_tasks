package test.java;

import main.java.App;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class AppTest {
    private Locale localeEn;
    private Locale localeRu;
    private App appEn;
    private App appRu;
    @Before
    public void setUp(){
        localeEn=new Locale("en");
        localeRu=new Locale("ru");
        appEn=new App(localeEn);
        appRu=new App(localeRu);
    }

    @Test
    public void getAnswerShouldReturnNullIfNeededKeyDoesntExist(){
        assertNull(appEn.getAnswer(5));
    }

    @Test
    public void getAnswerShouldReturnStringRelatedToQuestion(){
        assertEquals("Class", appEn.getAnswer(1));
        assertEquals("Класс", appRu.getAnswer(1));
    }

}