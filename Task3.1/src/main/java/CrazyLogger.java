package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrazyLogger {
    private StringBuilder logs;
    public final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : hh-mm");
    final static Pattern pattern = Pattern.compile("(\\d{2}-){2}\\d{4} : \\d{2}-\\d{2} .[^;]+;");

    public CrazyLogger() {
        logs = new StringBuilder();
    }

    public StringBuilder getLogs() {
        return logs;
    }

    public boolean addNewLog(String message, Date date) {
        if (message == null || date == null) {
            return false;
        }
        if (message.contains(";")) {
            System.out.println("Choose alternative to ;");
            return false;
        }
        logs.insert(logs.length(), dateFormat.format(date) + " - " + message + ";");
        return true;
    }

    public List<String> findLog(Date date) {
        if (date == null) {
            return null;
        }
        String dateString = dateFormat.format(date);
        return findLog(dateString);
    }

    public List<String> findLog(String message) {
        List<String> foundLogs = new LinkedList<>();
        if (message == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(logs);
        while (matcher.find()) {
            if (matcher.group(0).contains(message)) {
                System.out.println(matcher.group(0));
                foundLogs.add(matcher.group(0));
            }
        }
        if (foundLogs.isEmpty()) {
            return null;
        }
        return foundLogs;
    }
}
