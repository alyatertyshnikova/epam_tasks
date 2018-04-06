package main.java;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class PropertiesFile {
    private static PropertiesFile instance;
    private String fileName;
    /*Если добавить в Map элемент с ключом, который уже присутствует, то она перезапишет значение,
      соответсвующее ключу на значение добавляемого элемента*/
    private Map<String, String> values;
    final static Pattern splitPattern = Pattern.compile("[\\t :=]+");

    private PropertiesFile(String fileName) throws PropertiesFileNotFoundException {
        this.fileName = fileName;
        values = new HashMap<>();
        load(fileName);
    }

    public void showPropertiesData() {
        values.forEach((key, value) -> System.out.format("%s - %s\n", key, value));
    }

    public static PropertiesFile getInstance(String fileName) throws PropertiesFileNotFoundException {
        if (instance == null) {
            instance = new PropertiesFile(fileName);
        }
        return instance;
    }

    private void load(String fileName) throws PropertiesFileNotFoundException {
        String line;
        String[] entrySet;
        if (!fileName.contains(".properties")) {
            throw new PropertiesFileNotFoundException(".properties not found", fileName);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                entrySet = splitPattern.split(line.trim(), 2);
                values.put(entrySet[0], entrySet[1]);
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }

    }

    public String getValue(String key) throws KeyNotFoundException {
        String value;
        if ((value = values.get(key)) == null) {
            throw new KeyNotFoundException("Key is not found", key);
        }
        return value;
    }

    public String getFileName() {
        return fileName;
    }
}
