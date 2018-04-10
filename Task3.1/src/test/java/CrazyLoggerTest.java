package test.java;

import main.java.CrazyLogger;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class CrazyLoggerTest {
    private CrazyLogger crazyLogger;
    private Date date;

    @Before
    public void setUp() {
        crazyLogger = new CrazyLogger();
        date = new Date();
    }

    @Test
    public void addNewLogShouldReturnFalseForNullArgument() {
        assertFalse(crazyLogger.addNewLog(null, null));
        assertFalse(crazyLogger.addNewLog("Hi", null));
        crazyLogger.addNewLog(null, date);
    }

    @Test
    public void addNewLogShouldReturnFalseIfMessageConsistSemicolon() {
        assertFalse(crazyLogger.addNewLog("h;i", date));
    }

    @Test
    public void addNewLogShouldReturnTrueAndAddLog() {
        assertTrue(crazyLogger.addNewLog("Hi", date));
    }

    @Test
    public void findLogShouldReturnNullForNullArgument() {
        String nullString = null;
        Date nullDate = null;
        assertNull(crazyLogger.findLog(nullString));
        assertNull(crazyLogger.findLog(nullDate));
    }

    @Test
    public void findLogShouldReturnCorrectListOfLogsAndPrintCorrectInfo() {
        crazyLogger.addNewLog("Hi", date);
        List<String> dateListOfLogs = crazyLogger.findLog(date);
        List<String> hiListOfLogs = crazyLogger.findLog("Hi");
        for (String log : dateListOfLogs) {
            assertTrue(log.contains(CrazyLogger.dateFormat.format(date)));
        }
        for (String log : hiListOfLogs) {
            assertTrue(log.contains("Hi"));
        }
    }

    @Test
    public void findLogShouldReturnNullIfInfoWasNotFound() {
        assertNull(crazyLogger.findLog(date));
        assertNull(crazyLogger.findLog("Hi"));
    }

}