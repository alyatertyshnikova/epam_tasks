package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrazyLogger {
    private StringBuilder logs;
    final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : hh-mm");
    final static Pattern pattern = Pattern.compile("(\\d{2}-){2}\\d{4} : \\d{2}-\\d{2} .[^;]+;");

    public CrazyLogger() {
        logs = new StringBuilder();
    }

    public StringBuilder getLogs() {
        return logs;
    }

    public boolean addNewLog(String message, Date date) {
        if(message==null||date==null){
            return false;
        }
        if (message.contains(";")) {
            System.out.println("Choose alternative to ;");
            return false;
        }
        logs.insert(logs.length(), dateFormat.format(date) + " - " + message + ";");
        return true;
    }

    public boolean findLog(Date date) {
        if(date==null){
            return false;
        }
        String dateString = dateFormat.format(date);
        findLog(dateString);
        return true;
    }

    public boolean findLog(String message) {
        if(message==null){
            return false;
        }
        Matcher matcher = pattern.matcher(logs);
        while (matcher.find()) {
            if (matcher.group(0).contains(message)) {
                System.out.println(matcher.group(0));
            }
        }
        return true;
    }
}
