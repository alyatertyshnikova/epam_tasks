package test.java;

import main.java.CrazyLogger;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CrazyLoggerTest {
    private CrazyLogger crazyLogger;
    private Date date;

    @Before
    public void setUp() {
        crazyLogger = new CrazyLogger();
        date=new Date();
    }

    @Test
    public void addNewLogShouldReturnFalseForNullArgument(){
        assertFalse(crazyLogger.addNewLog(null, null));
        assertFalse(crazyLogger.addNewLog("Hi", null));
        crazyLogger.addNewLog(null, date);
    }

    @Test
    public void addNewLogShouldReturnFalseIfMessageConsistSemicolon(){
        assertFalse(crazyLogger.addNewLog("h;i", date));
    }

    @Test
    public void addNewLogShouldReturnTrueAndAddLog(){
        assertTrue(crazyLogger.addNewLog("Hi", date));
    }

    @Test
    public void findLogShouldReturnFalseForNullArgument(){
        String nullString=null;
        Date nullDate=null;
        assertFalse(crazyLogger.findLog(nullString));
        assertFalse(crazyLogger.findLog(nullDate));
    }

    @Test
    public void findLogShouldReturnTrueAndPrintCorrectInfo(){
        crazyLogger.addNewLog("Hi", date);
        assertTrue(crazyLogger.findLog(date));
        assertTrue(crazyLogger.findLog("Hi"));
    }

    @Test
    public void findLogShouldReturnTrueAndPrintNothingIfInfoDoesntExist() {
        assertTrue(crazyLogger.findLog(date));
        assertTrue(crazyLogger.findLog("Hi"));
    }

}