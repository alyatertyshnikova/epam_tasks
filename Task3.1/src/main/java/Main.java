package main.java;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger();
        Date currentDate = new Date();
        Date othDate = new Date(1100, 10, 23);
        crazyLogger.addNewLog("Hello World", currentDate);
        crazyLogger.addNewLog("Wow", currentDate);
        crazyLogger.addNewLog("Wow no", othDate);
        List<String> dateLogs = crazyLogger.findLog(othDate);
        List<String> textLogs = crazyLogger.findLog("Wow");
    }
}
